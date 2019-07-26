package com.luizapereira.coreengineering.tema8.main;

import com.luizapereira.coreengineering.tema8.persistence.LoanDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoanManagement {

    private LoanDAO loanDAO = new LoanDAO();
    private List<Loan> loanList;

    public LoanManagement() {
        loanList = new ArrayList<>();
    }

    public void newLoan(Person person, Book book) {
        if (person.getBorrowedBooks() < 5) {
            if(!book.getBorrowed()) {
                System.out.println("The book " + book.getTitle() + " was borrowed.\n");
                loanList.add(new Loan(person, book));
                person.borrowBook();
                book.setBorrowed(true);
            }
        }
    }

    public Book searchBookLoaned(int id) {
        Book auxBook;
        auxBook = loanList.stream().filter(loan -> loan.getLoanId() == id).findAny().orElse(null).getBook();

        if(auxBook != null){
            return auxBook;
        }
        throw new NullPointerException("There is no loan with this id");
    }

    public Person searchPersonWhoLoaned(int id){
        Person auxPerson;
        auxPerson = loanList.stream().filter(loan -> loan.getLoanId() == id).findAny().orElse(null).getPerson();

        if(auxPerson != null){
            return auxPerson;
        }
        throw new NullPointerException("There is no loan with this id");
    }

    public void renewLoan(int id) {
        for (Loan loan : loanList) {
            if (loan.getLoanId() == id) {
                loan.setLoanRenovation(loan.getLoanDay().plusDays(7));
            }
        }
    }

    public void returnBook(int id) {

        Loan loanAux;
        loanAux = loanList.stream().filter(loan -> {
            if (loan.getLoanId() == id) {
                int dayAux = LocalDate.now().getDayOfYear() - loan.getLoanDay().getDayOfYear();
                if (dayAux > 7) {
                    System.out.println("You delayed the return in " + (dayAux - 7) + " days!");
                    System.out.println("You have a debt of R$: " + ((dayAux - 7) * 5) + " Reais.\n");
                }
            }
            return true;
        }).findAny().orElse(null);

        if(loanAux != null) {
            loanList.remove(loanAux);
            System.out.println("Book returned!");
        }
    }

    public int delayedDays(int id){
        int dayAux = 0;
        Loan auxLoan = loanList.stream().filter(loan -> loan.getLoanId() == id).findAny().orElse(null);

        if(auxLoan != null){
            dayAux = (LocalDate.now().getDayOfYear() - auxLoan.getLoanDay().getDayOfYear());
            return dayAux;
        }
        throw new NullPointerException("There is no loan with this id");
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void showBorrowedBooksList() {

        if(!loanList.isEmpty()){
            loanList.stream().forEach(loan -> {
                System.out.println("Id : "+ loan.getLoanId() +" The book: " + loan.getBook().getTitle() + " is borrowed to: " + loan.getPerson().getName());
            });
        } else {
            System.out.println("There is no book loaned");
        }
    }

    public void readLoanData() {

        loanList = loanDAO.readLoanData();
    }

    public void writeLoanData() {

        loanDAO.writeLoanData(loanList);
    }
}
