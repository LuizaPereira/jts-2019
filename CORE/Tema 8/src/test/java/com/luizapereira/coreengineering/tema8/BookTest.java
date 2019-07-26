package com.luizapereira.coreengineering.tema8;

import com.luizapereira.coreengineering.tema8.main.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {


    public Book book;

    @Before
    public void initialize() {
        book = new Book("DELTORA QUEST", "EMILY RODDA");
    }

    @Test
    public void testGetID(){
        Assert.assertEquals(book.getID(),1);
    }

    @Test
    public void testGetTitle(){
        Assert.assertEquals(book.getTitle(),"DELTORA QUEST");
    }

    @Test
    public void testSetBorrowed(){
        book.setBorrowed(true);
        Assert.assertEquals(book.getBorrowed(),true);
    }

    @Test
    public void testGetBorrowed(){
        book.setBorrowed(false);
        Assert.assertEquals(book.getBorrowed(),false);
    }
}
