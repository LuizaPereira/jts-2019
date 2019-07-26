package com.luizapereira.coreengineering.tema8.main;

import com.luizapereira.coreengineering.tema8.persistence.BookDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private List<Book> books;
    private BookDAO bookDAO;

    public Library() {
        books = new ArrayList<>();
        bookDAO = new BookDAO();
    }

    public List<Book> getLibraryBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void deleteBook(int id) {
        Book bookAux = searchBookById(id);

        if(bookAux != null  && !bookAux.getBorrowed()){
            books.remove(bookAux);
        }
    }

    public Book searchBookById(int id){
       Book auxBook;
       auxBook = this.books.stream().filter(book -> book.getID() == id).findAny().orElse(null);

       if(auxBook != null){
           return auxBook;
       }
        throw new NullPointerException("That book does not exist");
    }

    public Book searchBookByTitle(String title) {
        Book auxBook;
        auxBook = this.books.stream().filter(book -> book.getTitle().equals(title)).findAny().orElse(null);

        if(auxBook != null){
            return auxBook;
        }
        throw new NullPointerException("That book does not exist");
    }

    public List<Book> searchBookByAuthor(String author) {
        List<Book> bookAux;
        bookAux = this.books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());

        if(!bookAux.isEmpty()) {
            return bookAux;
        }
        throw new NullPointerException("There is no Author : " + author);
    }

    public void readBookData() {

        books = bookDAO.readBookData();
    }

    public void writeBookData() {

        bookDAO.writeBookData(books);
    }
}

