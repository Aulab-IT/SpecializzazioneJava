package it.aulab.progettoblog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import it.aulab.progettoblog.models.Author;

public interface AuthorRepository extends ListCrudRepository<Author, Long>{
    List<Author> findByName(String firstname);

    List<Author> findBySurname(String lastname);

    List<Author> findByEmail(String email);
   
    List<Author> findByNameAndSurname(String firstname, String lastname);

    @Query(value = "SELECT * FROM authors a WHERE a.firstname = 'Giuseppe'", nativeQuery = true)
    List<Author> authorsWithSameName();

    @Query(value = "SELECT a FROM Author a WHERE a.name = 'Giuseppe'")
    List<Author> authorsWithSameNameNonNative();

}
