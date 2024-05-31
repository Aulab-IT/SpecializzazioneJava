package it.aulab.progettoblog.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.aulab.progettoblog.dtos.PostDto;
import it.aulab.progettoblog.models.Author;
import it.aulab.progettoblog.models.Post;
import it.aulab.progettoblog.repositories.AuthorRepository;
import it.aulab.progettoblog.repositories.CommentRepository;
import it.aulab.progettoblog.repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<PostDto> readAll() {
        List<PostDto> dtos = new ArrayList<PostDto>();
            for(Post post: postRepository.findAll()){
            dtos.add(mapper.map(post, PostDto.class));
            }
            return dtos;
    }

    @Override
    public PostDto read(Long id) {
        Optional<Post> optPost = postRepository.findById(id);
        if (optPost.isPresent()) {
            return mapper.map(optPost.get(), PostDto.class);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found");
        }
    }


    @Override
    public PostDto create(Post post) {
        // Validation
        if (post.getAuthor() != null && post.getAuthor().getId() != null) {
            Optional<Author> optAuthor = authorRepository.findById(post.getAuthor().getId());
            if (optAuthor.isPresent()) {
                post.setAuthor(optAuthor.get());
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Author id=" + post.getAuthor().getId() + " not found");
            }
        }
        return mapper.map(postRepository.save(post), PostDto.class);
    }

    @Override
    public PostDto update(Long id, Post post) {
        if (postRepository.existsById(id)) {
            post.setId(id);
            return mapper.map(postRepository.save(post), PostDto.class);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found");
        }

    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (postRepository.existsById(id)) {
            commentRepository.deleteByPostId(id);
            postRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found");
        }
    }
    
}
