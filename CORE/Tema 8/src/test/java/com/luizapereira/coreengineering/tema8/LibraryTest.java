package com.luizapereira.coreengineering.tema8;

import com.luizapereira.coreengineering.tema8.main.Book;
import com.luizapereira.coreengineering.tema8.main.Library;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

    public Library library;
    public Book book, book2;

    @Before
    public void initialize(){
        library = new Library();
        book = new Book("HARRY POTTER","J.K. ROWLING");
        book2 = new Book("NORTHERN LIGHTS","PHILLIP PULLMAN");
    }

    @Test
    public void testGetLibraryBooks(){
        library.addBook(book);
        Assert.assertEquals(library.getLibraryBooks().size(), 1);
    }

    @Test
    public void testAddBook(){
        library.addBook(book);
        Assert.assertEquals(library.getLibraryBooks().size(), 1);
    }

    @Test
    public void testDeleteBook(){
        library.addBook(book);
        library.addBook(book2);
        library.deleteBook(2);
        Assert.assertEquals(library.getLibraryBooks().size(), 1);
    }

    @Test
    public void testSearchBookById(){
        library.addBook(book);
        Assert.assertEquals(library.searchBookById(1), book);
    }

    @Test
    public void testSearchBookByTitle(){
        library.addBook(book);
        Assert.assertEquals(library.searchBookByTitle("HARRY POTTER"), book);
    }

    @Test
    public void testSearchBookByAuthor(){
        library.addBook(book);
        Assert.assertEquals(library.searchBookByAuthor("J.K. ROWLING").get(0), book);
    }

    @Test(expected = NullPointerException.class)
    public void testSearchBookByNonexistentId(){
        library.searchBookById(3);
    }

    @Test(expected = NullPointerException.class)
    public void testSearchBookByNonexistentTitle(){
        library.searchBookByTitle("HARRY POTTER");
    }

    @Test(expected = NullPointerException.class)
    public void testSearchBookByNonexistentAuthor(){
        library.searchBookByAuthor("J.K. ROWLING");
    }

    @Test(expected = NullPointerException.class)
    public void testGetEmptyLibraryBooks(){
        library.getLibraryBooks();
    }
}
