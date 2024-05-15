package it.aulab.progettoblog.repositories;

import org.springframework.data.repository.ListCrudRepository;

import it.aulab.progettoblog.models.Post;

public interface PostRepository extends ListCrudRepository<Post, Long>{
   
}

