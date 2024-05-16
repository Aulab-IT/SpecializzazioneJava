package it.aulab.progettoblog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import it.aulab.progettoblog.models.Author;
import it.aulab.progettoblog.repositories.AuthorRepository;
import it.aulab.progettoblog.services.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    AuthorService authorService;

    // @RequestMapping(method=RequestMethod.GET)
    @GetMapping
    public List<Author> getAllAuthors(){
        return authorService.readAll();
    }

    // @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @GetMapping("{id}")
    public Author getAuthor(@PathVariable("id") Long id){
        return authorService.read(id);
    }

    @PostMapping(consumes = "application/json")
    public Author createAuthor(@RequestBody Author author){
        return authorService.create(author);
    }

    @PutMapping("{id}")
    public Author updateAuthor(@PathVariable("id") Long id, @RequestBody Author author){
        author.setId(id);
        return authorService.update(id, author);
    }

    @DeleteMapping("{id}")
    public void deleteAuthor(@PathVariable("id") Long id){
        authorService.delete(id);
    }

}
