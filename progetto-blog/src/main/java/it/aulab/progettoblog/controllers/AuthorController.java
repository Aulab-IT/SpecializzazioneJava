package it.aulab.progettoblog.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import it.aulab.progettoblog.models.Author;

@Controller
public class AuthorController {

    public @ResponseBody List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

}
