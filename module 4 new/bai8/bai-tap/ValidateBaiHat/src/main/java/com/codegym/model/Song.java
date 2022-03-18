package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Song implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 5, max = 800)
    private String songName;
    @Size(min = 5, max = 300)
    private String author;
    @Size(min = 5, max = 1000)
    private String category;

    public Song() {
    }

    public Song(Long id, String songName, String author, String category) {
        this.id = id;
        this.songName = songName;
        this.author = author;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Song.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Song song = (Song) target;
        String songName = song.getSongName();
        ValidationUtils.rejectIfEmpty(errors, "songName", "songName.empty");
        if (!songName.matches("(^([a-zA-Z0-9]){1,}(\\s{1}([A-Za-z0-9]){1,})*$)")){
            errors.rejectValue("songName", "songName.matches");
        }
        String author = song.getAuthor();
        ValidationUtils.rejectIfEmpty(errors, "author", "author.empty");
        if (!author.matches("(^([a-zA-Z0-9]){1,}(\\s{1}([A-Za-z0-9]){1,})*$)")){
            errors.rejectValue("author", "author.matches");
        }
        String category = song.getCategory();
        ValidationUtils.rejectIfEmpty(errors, "category", "category.empty");
        if (!category.matches("(^([a-zA-Z0-9]){1,}(\\s{1}([A-Za-z0-9]){1,})*$)")) {
            errors.rejectValue("category", "category.matches");
        }
    }
}
