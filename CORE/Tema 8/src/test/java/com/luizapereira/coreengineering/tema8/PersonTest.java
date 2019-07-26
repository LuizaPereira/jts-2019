package com.luizapereira.coreengineering.tema8;

import com.luizapereira.coreengineering.tema8.main.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    public Person person;

    @Before
    public void initialize() {
        person = new Person("4521222115", "LAURA");
    }

    @Test
    public void testGetName(){
        Assert.assertEquals(person.getName(),"LAURA");
    }

    @Test
    public void testGetBorrowedBooks(){
        person.borrowBook();
        Assert.assertEquals(person.getBorrowedBooks(), 1);
    }

    @Test
    public void testReturnBook(){
        person.borrowBook();
        person.returnBook();
        Assert.assertEquals(person.getBorrowedBooks(), 0);
    }

    @Test
    public void testBorrowBook(){
        person.borrowBook();
        person.borrowBook();
        Assert.assertEquals(person.getBorrowedBooks(), 2);
    }

    @Test
    public void testGetBorrowedCountBooks(){
        person.borrowBook();
        Assert.assertEquals(person.getBorrowedCountBooks(), 1);
    }

    @Test
    public void testAddDelayedPersonList(){
        person.addDelayedPersonList("TEST", 15);
        Assert.assertEquals(person.getDelayedLoans().size(), 1);
    }

    @Test
    public void testGetDelayedLoans(){
        person.addDelayedPersonList("TEST", 15);
        person.addDelayedPersonList("TEST 2", 30);
        Assert.assertEquals(person.getDelayedLoans().size(), 2);
    }
}
