package it.aulab.progettoblog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.aulab.progettoblog.models.Post;
import it.aulab.progettoblog.repositories.PostRepository;

@Controller
@RequestMapping("/api/posts")
public class PostRestController {
    @Autowired
    PostRepository postRepository;

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<Post> getAllPost(){
        return postRepository.findAll();
    }

}
