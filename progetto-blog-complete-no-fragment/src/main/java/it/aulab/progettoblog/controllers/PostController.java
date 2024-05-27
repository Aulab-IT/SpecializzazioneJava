package it.aulab.progettoblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.progettoblog.models.Post;
import it.aulab.progettoblog.services.AuthorService;
import it.aulab.progettoblog.services.PostService;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    AuthorService authorService;
    
    @GetMapping
    public String postsView(Model model) {
        model.addAttribute("title", "Posts");
        model.addAttribute("posts", postService.readAll());
        return "posts";
    }

    @GetMapping("create")
    public String createPostView(Model model) {
        model.addAttribute("title", "Create Post");
        model.addAttribute("post", new Post());
        model.addAttribute("authors", authorService.readAll());
        return "createPost";
    }

    @PostMapping
    public String createPost(@ModelAttribute("post") Post post) {
        postService.create(post);
        return "redirect:/posts";
    }

    @GetMapping("remove/{id}")
    public String removePost(@PathVariable("id") Long id){
        postService.delete(id);
        return "redirect:/posts";
    }

    @GetMapping("update/{id}")
    public String updatePostView(@PathVariable("id") Long id, Model model) {
        model.addAttribute("title", "Update Post");
        model.addAttribute("post", postService.read(id));
        model.addAttribute("authors", authorService.readAll());
        return "updatePost";
    }

    @PostMapping("{id}")
    public String updatePost(@PathVariable("id")Long id, @ModelAttribute("post") Post post){
        postService.update(id, post);
        return "redirect:/posts";
    }
}
