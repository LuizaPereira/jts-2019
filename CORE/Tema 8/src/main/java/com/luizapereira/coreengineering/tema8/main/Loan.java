package com.luizapereira.coreengineering.tema8.main;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Loan {

    private int loanId;
    private Person person;
    private Book book;
    private LocalDate deadline;
    public static int aux = 1;


    public Loan(Person person, Book book) {
        this.loanId = aux++;
        this.person = person;
        this.book = book;
        this.deadline = LocalDate.now();
    }

    public LocalDate getLoanDay() {
        return deadline;
    }

    public Person getPerson() {
        return person;
    }

    public Book getBook() {
        return book;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanRenovation(LocalDate deadline) {
        this.deadline = deadline;
    }
}
