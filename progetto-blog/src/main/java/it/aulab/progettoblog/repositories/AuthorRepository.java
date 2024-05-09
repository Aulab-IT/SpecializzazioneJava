package it.aulab.progettoblog.repositories;

import org.springframework.data.repository.CrudRepository;
import it.aulab.progettoblog.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
   
}
