package it.aulab.showcasehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.showcasehub.dtos.ProductDto;
import it.aulab.showcasehub.models.Product;
import it.aulab.showcasehub.repositories.CategoryRepository;
import it.aulab.showcasehub.services.CrudService;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    @Qualifier("productService")
    private CrudService<ProductDto,Product,Long> productService;

    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping
    public String productsIndex(Model viewModel) {
        viewModel.addAttribute("title", "All products");
        viewModel.addAttribute("products", productService.readAll());
        return "products";
    }

    @GetMapping("create")
    public String createProduct(Model viewModel) {
        viewModel.addAttribute("title", "Create product");
        viewModel.addAttribute("product", new Product());
        viewModel.addAttribute("categories", categoryRepository.findAll());
        return "createProduct";
    }

    @PostMapping
    public String addProduct(@ModelAttribute("product") Product product) {
        productService.create(product);
        return "redirect:/products";
    }

    @GetMapping("remove/{id}")
    public String removeProduct(@PathVariable("id") Long id) {
        productService.delete(id);
        return "redirect:/products";
    }

    @GetMapping("update/{id}")
    public String modifyProduct(@PathVariable("id") Long id, Model viewModel) {
        viewModel.addAttribute("title", "Update product");
        viewModel.addAttribute("product", productService.read(id));
        viewModel.addAttribute("categories", categoryRepository.findAll());
        return "updateProduct";
    }

    @PostMapping("update")
    public String modifyProduct(@ModelAttribute("product") Product product) {
        productService.update(product.getId(), product);
        return "redirect:/products";
    }
}