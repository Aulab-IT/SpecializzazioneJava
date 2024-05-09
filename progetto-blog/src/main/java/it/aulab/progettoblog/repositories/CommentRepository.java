package it.aulab.progettoblog.repositories;
import org.springframework.data.repository.CrudRepository;

import it.aulab.progettoblog.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{
   
}

