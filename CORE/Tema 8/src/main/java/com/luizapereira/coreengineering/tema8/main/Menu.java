package com.luizapereira.coreengineering.tema8.main;

import java.util.Scanner;

public class Menu {

    private Library library;
    private LoanManagement loanManagement;
    private CustomerRegistration customerRegistration;

    public Menu() {

        library = new Library();
        library.readBookData();
        Book.aux = library.getLibraryBooks().size() + 1;
        loanManagement = new LoanManagement();
        loanManagement.readLoanData();
        Loan.aux = loanManagement.getLoanList().size();
        customerRegistration = new CustomerRegistration();
        customerRegistration.readPersonData();
    }

    public void initialize() {
        while (true) {
            System.out.println("\nWelcome to the Library!");
            System.out.println("Please select an action:\n");
            System.out.println("[A] Add a book");
            System.out.println("[D] Delete a book");
            System.out.println("[L] List all the Library books");
            System.out.println("[S] Search for a book");
            System.out.println("[B] Borrow a book");
            System.out.println("[R] Return a book");
            System.out.println("[N] Renew a book loan");
            System.out.println("[H] Loan History");
            System.out.println("[T] Top 10 customers");
            System.out.println("[Y] List of all delayed loans");
            System.out.println("[C] Add a Customer");
            System.out.println("[E] Exit");

            Scanner scannerAction = new Scanner(System.in);
            String inputedAction = scannerAction.nextLine().toUpperCase();

            switch (inputedAction) {

                case "A":
                    addBook();
                    break;
                case "D":
                    deleteBook();
                    break;
                case "L":
                    listBooks();
                    break;
                case "S":
                    searchBook();
                    break;
                case "B":
                    borrowBook();
                    break;
                case "R":
                    returnBook();
                    break;
                case "N":
                    renewLoan();
                    break;
                case "H":
                    loanHistory();
                    break;
                case "T":
                    showTop10();
                    break;
                case "Y":
                    showDelayedBooks();
                    break;
                case "C":
                    addCustomer();
                    break;
                case "E":
                    saveChanges();
                    System.exit(0);
                default:
                    System.out.println("Invalid option, please select again!\n ");
            }
        }
    }

    private void addCustomer(){

        System.out.println("\nInform the CPF:");
        Scanner scannerCPF = new Scanner(System.in);
        String inputedCPF = scannerCPF.nextLine().toUpperCase();

        System.out.println("\nInform the customer name:");
        Scanner scannerName = new Scanner(System.in);
        String inputedName = scannerName.nextLine().toUpperCase();

        customerRegistration.addCustomer(new Person(inputedCPF,inputedName));

        saveChanges();
    }

    private void showDelayedBooks() {

        customerRegistration.showDelayedBooks();
    }

    private void renewLoan() {

        loanManagement.showBorrowedBooksList();
        System.out.println("Inform the loan id to renew:");
        Scanner scannerId = new Scanner(System.in);
        int inputedId = scannerId.nextInt();

        loanManagement.renewLoan(inputedId);
        System.out.println("\nRenewed loan.");

        saveChanges();
    }

    private void returnBook() {

        Book bookAux;
        Person personAux;

        loanManagement.showBorrowedBooksList();
        System.out.println("Inform the loan id to return:");
        Scanner scannerId = new Scanner(System.in);
        int inputedId = scannerId.nextInt();

        bookAux = loanManagement.searchBookLoaned(inputedId);
        library.searchBookById(bookAux.getID()).setBorrowed(false);

        personAux = loanManagement.searchPersonWhoLoaned(inputedId);
        customerRegistration.searchPersonByName(personAux.getName()).returnBook();

        if(loanManagement.delayedDays(inputedId) > 7){
            customerRegistration.searchPersonByName(personAux.getName()).addDelayedPersonList(bookAux.getTitle(),(loanManagement.delayedDays(inputedId)) - 7);
        }

        loanManagement.returnBook(inputedId);

        saveChanges();

        System.out.println("Would you like to return another book? [Y] Yes or [N] No");
        Scanner scannerAnswer = new Scanner(System.in);
        String inputedAnswer = scannerAnswer.nextLine();

        if(inputedAnswer.equals("Y")){
            returnBook();
        }
    }

    private void borrowBook() {

        listBooks();
        System.out.println("\nInform the book id:");
        Scanner scannerId = new Scanner(System.in);
        int inputedId = scannerId.nextInt();

        System.out.println("\nInform the customer name:");
        Scanner scannerName = new Scanner(System.in);
        String inputedName = scannerName.nextLine().toUpperCase();

        loanManagement.newLoan(customerRegistration.searchPersonByName(inputedName),
                library.searchBookById(inputedId));

        saveChanges();
    }

    private void addBook() {

        System.out.println("Inform the book title:");
        Scanner scannerTitle = new Scanner(System.in);
        String inputedTitle = scannerTitle.nextLine().toUpperCase();

        System.out.println("Inform the book author");
        Scanner scannerAuthor = new Scanner(System.in);
        String inputedAuthor = scannerAuthor.nextLine().toUpperCase();

        library.addBook((new Book(inputedTitle, inputedAuthor)));
        System.out.println("\nNew book (" + inputedTitle + ") registered!");

        saveChanges();
    }

    private void deleteBook() {
        System.out.println("Inform the book id:");
        Scanner scannerId = new Scanner(System.in);
        int inputedId = scannerId.nextInt();

        library.deleteBook(inputedId);
        System.out.println("Book deleted.");

        saveChanges();
    }

    private void listBooks() {

        for (Book book : library.getLibraryBooks()) {
            System.out.println(book.toString());
        }
    }

    private void searchBook() {
        System.out.println("Would you like to search by the Author or by the Title? [A = Author and T = title]");

        Scanner scannerAnswer = new Scanner(System.in);
        String answer = scannerAnswer.nextLine().toUpperCase();

        switch (answer) {

            case "A":
                System.out.println("Inform the author:");
                Scanner scannerAuthor = new Scanner(System.in);
                String inputedAuthor = scannerAuthor.nextLine().toUpperCase();
                System.out.println(library.searchBookByAuthor((inputedAuthor)));
                break;

            case "T":
                System.out.println("Inform the title:");
                Scanner scannerTitle = new Scanner(System.in);
                String inputedTitle = scannerTitle.nextLine().toUpperCase();
                System.out.println(library.searchBookByTitle((inputedTitle)));
                break;
        }
    }

    private void showTop10() {

        customerRegistration.sortTop10();

        for (int top = 0; top < 10; top++) {
            System.out.println(top + 1 + "- " + customerRegistration.getCustomers().get(9 - top).getName() +
                    "  - Loans: " + customerRegistration.getCustomers().get(9 - top).getBorrowedCountBooks());
        }
    }

    private void loanHistory() {

        loanManagement.showBorrowedBooksList();
    }

    private void saveChanges() {
        library.writeBookData();
        loanManagement.writeLoanData();
        customerRegistration.writePersonData();
    }
}
