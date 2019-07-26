package com.luizapereira.coreengineering.tema8;

import com.luizapereira.coreengineering.tema8.main.Book;
import com.luizapereira.coreengineering.tema8.main.Loan;
import com.luizapereira.coreengineering.tema8.main.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class LoanTest {

    public Loan loan;
    public Person person;
    public Book book;

    @Before
    public void initialize() {
        person = new Person("4521222115", "LAURA");
        book = new Book("DELTORA QUEST", "EMILY RODDA");
        loan = new Loan(person,book);
    }

    @Test
    public void testGetLoanDay(){
        Assert.assertEquals(loan.getLoanDay(), LocalDate.now());
    }

    @Test
    public void testGetPerson(){
        Assert.assertEquals(loan.getPerson(), person);
    }

    @Test
    public void testGetBook(){
        Assert.assertEquals(loan.getBook(), book);
    }

    @Test
    public void testGetLoanId(){
        Assert.assertEquals(loan.getLoanId(), 1);
    }

    @Test
    public void testSetLoanRenovation(){
        loan.setLoanRenovation(LocalDate.now().plusDays(5));
        Assert.assertEquals(loan.getLoanDay(), LocalDate.now().plusDays(5));

    }
}

