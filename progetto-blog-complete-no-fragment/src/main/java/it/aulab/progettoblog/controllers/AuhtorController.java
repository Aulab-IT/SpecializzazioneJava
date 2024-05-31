package it.aulab.progettoblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.progettoblog.dtos.AuthorDto;
import it.aulab.progettoblog.models.Author;
import it.aulab.progettoblog.models.Post;
import it.aulab.progettoblog.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuhtorController {

    @Autowired
    AuthorService authorService;

    @GetMapping
    public String authorsView(Model viewModel) {
        viewModel.addAttribute("title", "Authors");
        viewModel.addAttribute("authors", authorService.readAll());
        return "authors";
    }

    @GetMapping("create")
    public String createAuthor(Model viewModel) {
        viewModel.addAttribute("title", "Add Author");
        viewModel.addAttribute("author", new Author());
        return "createAuthor";
    }

    @PostMapping
    public String addAuthor(@ModelAttribute("author") Author author) {
        authorService.create(author);
        return "redirect:/authors";
    }

    @GetMapping("remove/{id}")
    public String removeAuthor(@PathVariable("id") Long id) {
        authorService.delete(id);
        return "redirect:/authors";
    }

    @GetMapping("modify/{id}")
    public String modifyAuthor(@PathVariable("id") Long id, Model viewModel) {
        viewModel.addAttribute("title", "Modify Author");
        viewModel.addAttribute("author", authorService.read(id));
        return "updateAuthor";
    }

    @PostMapping("update")
    public String modifyAuthor(@ModelAttribute("author") Author author) {
        authorService.update(author.getId(), author);
        return "redirect:/authors";
    }
}