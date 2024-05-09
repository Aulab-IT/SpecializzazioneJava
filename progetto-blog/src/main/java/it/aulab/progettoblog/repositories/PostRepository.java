package it.aulab.progettoblog.repositories;

import org.springframework.data.repository.CrudRepository;
import it.aulab.progettoblog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
   
}

