package it.aulab.showcasehub.repositories;

import org.springframework.data.repository.ListCrudRepository;

import it.aulab.showcasehub.models.Category;

public interface CategoryRepository extends ListCrudRepository<Category, Long>{
   
}