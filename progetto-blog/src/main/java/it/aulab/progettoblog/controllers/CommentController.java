package it.aulab.progettoblog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.aulab.progettoblog.models.Comment;
import it.aulab.progettoblog.repositories.CommentRepository;

@Controller
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentRepository commentRepository;


    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<Comment> getAllPost(){
        return commentRepository.findAll();
    }

}
