package it.aulab.progettoblog.repositories;
import org.springframework.data.repository.ListCrudRepository;

import it.aulab.progettoblog.models.Comment;

public interface CommentRepository extends ListCrudRepository<Comment, Long>{
   
}

