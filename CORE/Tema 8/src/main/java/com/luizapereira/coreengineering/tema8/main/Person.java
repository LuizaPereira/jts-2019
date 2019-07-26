package com.luizapereira.coreengineering.tema8.main;

import java.util.HashMap;
import java.util.Map;

public class Person implements Comparable<Person> {
    private String cpf;
    private String name;
    private int borrowedBooks;
    private int top10;
    private Map<String, Integer> delayedLoan = new HashMap<>();

    public Person(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
        this.borrowedBooks = 0;
        this.top10 = 0;
    }

    public String getName() {
        return name;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void returnBook() {
        borrowedBooks--;
    }

    public void borrowBook() {
        borrowedBooks++;
        top10++;
    }

    public int getBorrowedCountBooks() {
        return top10;
    }

    public String toString() {
        return "Name: " + name + " CPF: " + cpf;
    }

    @Override
    public int compareTo(Person o) {
        Integer tam = top10;
        return tam.compareTo(o.getBorrowedCountBooks());
    }

    public void addDelayedPersonList(String book, int delayedDays) {
        delayedLoan.put(book, delayedDays);
    }

    public Map<String, Integer> getDelayedLoans() {
        return this.delayedLoan;
    }
}
