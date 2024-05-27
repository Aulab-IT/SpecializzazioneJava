package it.aulab.progettoblog.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import it.aulab.progettoblog.models.Author;
import jakarta.persistence.Transient;

public class PostDto {
    private Long id;
    private String title;
    private String body;
    private String publishDate;

    private Author author;
    private int numberOfComments;

    public PostDto() {
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }
    public void setNumberOfComments(Integer numberOfComments) {
        this.numberOfComments = numberOfComments;
    }
}
