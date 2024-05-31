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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.aulab.progettoblog.dtos.CommentDto;
import it.aulab.progettoblog.models.Comment;
import it.aulab.progettoblog.repositories.CommentRepository;
import it.aulab.progettoblog.services.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentRestController {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CommentService commentService;

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<CommentDto> getAllPost(){
        return commentService.readAll();
    }

    @GetMapping("{id}")
    public CommentDto getComment(@PathVariable("id") Long id){
        return commentService.read(id);
    }

    @PostMapping(consumes = "application/json")
    public CommentDto createComment(@RequestBody Comment comment){
        return commentService.create(comment);
    }

    @PutMapping("{id}")
    public CommentDto updateComment(@PathVariable("id") Long id, @RequestBody Comment comment){
        comment.setId(id);
        return commentService.update(id, comment);
    }

    @DeleteMapping("{id}")
    public void deleteComment(@PathVariable("id") Long id){
        commentService.delete(id);
    }

}
