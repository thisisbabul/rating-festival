package com.festival.ratingservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    private int id;
    private int rating;
    private String comment;
    private String author;
    private int festival;

    public Rating() {
    }

    public Rating(int id, int rating, String comment, String author, int festival) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.author = author;
        this.festival = festival;
    }

    public int getFestival() {
        return festival;
    }

    public void setFestivalId(int festivalId) {
        this.festival = festivalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
