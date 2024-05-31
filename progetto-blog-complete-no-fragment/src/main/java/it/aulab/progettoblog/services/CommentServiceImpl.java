package it.aulab.progettoblog.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.aulab.progettoblog.dtos.CommentDto;
import it.aulab.progettoblog.models.Comment;
import it.aulab.progettoblog.models.Post;
import it.aulab.progettoblog.repositories.CommentRepository;
import it.aulab.progettoblog.repositories.PostRepository;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepository commentRepository;
    
    @Autowired
    PostRepository postRepository;
    
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<CommentDto> readAll() {
        List<CommentDto> dtos = new ArrayList<CommentDto>();
        dtos = commentRepository.findAll().stream().map((comment)-> mapper.map(comment, CommentDto.class)).toList();
        return dtos;
    }

    @Override
    public CommentDto read(Long id) {
        Optional<Comment> optComment = commentRepository.findById(id);
        if (optComment.isPresent()) {
            return mapper.map(optComment.get(), CommentDto.class);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Comment not found");
        }
    }

    @Override
    public CommentDto create(Comment comment) {
        // Validation
        if (comment.getPost() != null && comment.getPost().getId() != null) {
            Optional<Post> optPost = postRepository.findById(comment.getPost().getId());
            if (optPost.isPresent()) {
                comment.setPost(optPost.get());
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Comment id=" + comment.getPost().getId() + " not found");
            }
        }
        return mapper.map(commentRepository.save(comment), CommentDto.class);
    }

    @Override
    public void delete(Long id) {
        if (commentRepository.existsById(id)) {
            commentRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Comment not found");
        }
    }


    @Override
    public CommentDto update(Long id, Comment comment) {
        if (commentRepository.existsById(id)) {
            comment.setId(id);
            return mapper.map(commentRepository.save(comment), CommentDto.class);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Comment not found");
        }
    }
    
}
