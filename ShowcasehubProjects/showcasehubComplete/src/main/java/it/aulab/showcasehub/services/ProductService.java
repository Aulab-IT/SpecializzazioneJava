package it.aulab.showcasehub.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.aulab.showcasehub.dtos.ProductDto;
import it.aulab.showcasehub.models.Product;
import it.aulab.showcasehub.repositories.ProductRepository;

@Service
public class ProductService implements CrudService<ProductDto, Product, Long>{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ProductDto> readAll() {
        List<ProductDto> dtos = new ArrayList<ProductDto>();
        for(Product product: productRepository.findAll()){
            dtos.add(mapper.map(product, ProductDto.class));
        }
        return dtos;
    }

    @Override
    public ProductDto read(Long id) {
        Optional<Product> optProduct = productRepository.findById(id);
        if (optProduct.isPresent()) {
            return mapper.map(optProduct.get(), ProductDto.class);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product id=" + id + " not found");
        }
    }

    @Override
    public ProductDto create(Product product) {
            return mapper.map(productRepository.save(product), ProductDto.class);
    }

    @Override
    public ProductDto update(Long id, Product product) {
            if (productRepository.existsById(id)) {
                product.setId(id);
                return mapper.map(productRepository.save(product), ProductDto.class) ;
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
    }

    @Override
    public void delete(Long id) {
            productRepository.deleteById(id);
    }

}