package it.aulab.progettoblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.progettoblog.models.Comment;
import it.aulab.progettoblog.services.CommentService;
import it.aulab.progettoblog.services.PostService;

@Controller
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentService commentService;

    @Autowired
    PostService postService;
    
    @GetMapping
    public String commentsView(Model viewModel) {
        viewModel.addAttribute("title", "Comments");
        viewModel.addAttribute("comments", commentService.readAll());
        return "comments";
    }

    @GetMapping("create")
    public String createCommentView(Model model) {
        model.addAttribute("title", "Create comment");
        model.addAttribute("comment", new Comment());
        model.addAttribute("posts", postService.readAll());
        return "createComment";
    }

    @PostMapping
    public String createComment(@ModelAttribute("comment") Comment comment) {
        commentService.create(comment);
        return "redirect:/comments";
    }

    @GetMapping("remove/{id}")
    public String removeComment(@PathVariable("id") Long id){
        commentService.delete(id);
        return "redirect:/comments";
    }

    @GetMapping("update/{id}")
    public String updatePostView(@PathVariable("id") Long id, Model model) {
        model.addAttribute("title", "Update comment");
        model.addAttribute("comment", commentService.read(id));
        model.addAttribute("posts", postService.readAll());
        return "updateComment";
    }

    @PostMapping("{id}")
    public String updatePost(@PathVariable("id")Long id, @ModelAttribute("comment") Comment comment){
        commentService.update(id, comment);
        return "redirect:/comments";
    }
}
