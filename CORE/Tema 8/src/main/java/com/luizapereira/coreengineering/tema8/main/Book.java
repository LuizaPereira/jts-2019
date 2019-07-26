package com.luizapereira.coreengineering.tema8.main;

public class Book {

    private int id;
    private String title;
    private String author;
    private boolean borrowed;
    public static int aux = 1;

    public Book(String title, String author) {
        this.id = aux++;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public int getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String toString() {
        return "Id: " + id + " Book: " + title + " Author: " + author + " Is it borrowed?: " + borrowed;
    }
}
