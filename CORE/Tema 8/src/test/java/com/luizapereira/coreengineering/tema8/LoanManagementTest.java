package com.luizapereira.coreengineering.tema8;

import com.luizapereira.coreengineering.tema8.main.Book;
import com.luizapereira.coreengineering.tema8.main.LoanManagement;
import com.luizapereira.coreengineering.tema8.main.Person;
import cucumber.api.java.cs.A;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class LoanManagementTest {

    public LoanManagement loanManagement;
    public Book book;
    public Person person;

    @Before
    public void initialize(){
        loanManagement = new LoanManagement();
        book = new Book("HARRY POTTER","J.K. ROWLING");
        person = new Person("11411221221", "LAURA");
    }

    @Test
    public void testNewLoan(){
        loanManagement.newLoan(person,book);
        Assert.assertEquals(loanManagement.getLoanList().size(),1);
    }

    @Test
    public void testSearchBookLoaned(){
        loanManagement.newLoan(person,book);
        Assert.assertEquals(loanManagement.searchBookLoaned(1), book);
    }

    @Test
    public void testSearchPersonWhoLoaned(){
        loanManagement.newLoan(person,book);
        Assert.assertEquals(loanManagement.searchPersonWhoLoaned(1), person);
    }

    @Test
    public void testRenewLoan(){
        loanManagement.newLoan(person,book);
        loanManagement.renewLoan(1);
        Assert.assertEquals(loanManagement.getLoanList().get(0).getLoanDay(), LocalDate.now().plusDays(7));
    }

    @Test
    public void testReturnBook(){
        loanManagement.newLoan(person,book);
        loanManagement.returnBook(1);
        Assert.assertEquals(loanManagement.getLoanList().size(), 0);
    }

    @Test
    public void testDelayedDays(){
        loanManagement.newLoan(person,book);
        Assert.assertEquals(loanManagement.delayedDays(1), 0);
    }

    @Test
    public void testGetLoanList(){
        loanManagement.newLoan(person,book);
        Assert.assertEquals(loanManagement.getLoanList().size(), 1);
    }

    @Test(expected = NullPointerException.class)
    public void testShowBorrowedBooksEmptyList(){
        loanManagement.showBorrowedBooksList();
    }
}
