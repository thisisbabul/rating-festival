package com.festival.client.model;

public class Rating {
    private int rating;
    private String comment;
    private String author;
    private int festival;

    public Rating() {
    }

    public Rating(int rating, String comment, String author, int festival) {
        this.rating = rating;
        this.comment = comment;
        this.author = author;
        this.festival = festival;
    }

    public int getFestival() {
        return festival;
    }

    public void setFestival(int festival) {
        this.festival = festival;
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
