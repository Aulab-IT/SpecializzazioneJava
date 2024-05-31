package it.aulab.progettoblog.services;

import java.util.List;

import it.aulab.progettoblog.dtos.CommentDto;
import it.aulab.progettoblog.models.Comment;

public interface CommentService {
    List<CommentDto> readAll();
    CommentDto read(Long id);
    CommentDto create(Comment comment);
    CommentDto update(Long id, Comment comment);
    void delete(Long id);
}
