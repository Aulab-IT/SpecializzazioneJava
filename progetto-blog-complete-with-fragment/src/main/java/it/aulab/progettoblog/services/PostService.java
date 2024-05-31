package it.aulab.progettoblog.services;

import java.util.List;
import it.aulab.progettoblog.dtos.PostDto;
import it.aulab.progettoblog.models.Post;

public interface PostService {
    List<PostDto> readAll();
    PostDto read(Long id);
    PostDto create(Post post);
    PostDto update(Long id, Post post);
    void delete(Long id);
}
