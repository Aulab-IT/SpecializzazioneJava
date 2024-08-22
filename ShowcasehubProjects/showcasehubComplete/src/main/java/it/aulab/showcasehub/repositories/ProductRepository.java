package it.aulab.showcasehub.repositories;

import org.springframework.data.repository.ListCrudRepository;

import it.aulab.showcasehub.models.Product;

public interface ProductRepository extends ListCrudRepository<Product, Long>{
   
}