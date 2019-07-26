package com.luizapereira.coreengineering.tema10.main;

import com.luizapereira.coreengineering.tema10.persistence.AgendaDAO;

import java.util.Scanner;

public class MenuAgenda {

    private AgendaDAO agendaDAO;
    private Scanner scanner;

    public MenuAgenda() {
        agendaDAO = new AgendaDAO();
        scanner = new Scanner(System.in);
    }

    public void initialize() {
        while (true) {
            System.out.println("Welcome to your AgendaController!");
            System.out.println("Please select an action:\n");
            System.out.println("[A] Add a contact.");
            System.out.println("[R] Remove a contact.");
            System.out.println("[L] List all your contacts order by Name.");
            System.out.println("[I] List all your contacts order by ID.");
            System.out.println("[S] Search for a contact.");
            System.out.println("[E] Exit.");

            String inputedAction = scanner.nextLine().toUpperCase();

            switch (inputedAction) {

                case "A":
                    addPerson();
                    break;
                case "R":
                    removePerson();
                    break;
                case "L":
                    listAllContactsByName();
                    break;
                case "I":
                    listAllContactsByID();
                    break;
                case "S":
                    searchForPerson();
                    break;
                case "E":
                    System.exit(0);
                default:
                    System.out.println("Invalid option, please select again!\n ");
            }
        }
    }

    private void addPerson() {

        System.out.println("Please inform a name for the contact: ");
        String inputedName = scanner.nextLine();

        System.out.println("Please inform an email for the contact: ");
        String inputedEmail = scanner.nextLine();

        System.out.println("Please inform a phone number for the contact: ");
        String inputedPhone = scanner.nextLine();

        agendaDAO.addPerson(new Person(inputedName,inputedEmail,inputedPhone));
    }

    private void removePerson() {

        System.out.println("Please select an id to remove");
        int inputedId = scanner.nextInt();
        agendaDAO.removePerson(inputedId);
    }

    private void listAllContactsByName() {

        System.out.println(agendaDAO.listPersonsByName());
    }

    private void listAllContactsByID() {

        System.out.println(agendaDAO.listPersonsByID());
    }

    private void searchForPerson() {
        System.out.println("Would you like to search by id or by name? [I = ID and N = name]");
        String answer = scanner.nextLine().toUpperCase();

        switch (answer) {
            case "I":
                System.out.println("Inform the id: ");
                Scanner scannerIdSearch = new Scanner(System.in);
                int inputedIdSearch = scannerIdSearch.nextInt();
                System.out.println(agendaDAO.searchPersonByID(inputedIdSearch));
                break;

            case "N":
                System.out.println("Inform the name:");
                String inputedName = scanner.nextLine();
                System.out.println(agendaDAO.searchPersonByName(inputedName));
                break;
            default:
                System.out.println("Invalid option, please select again!\n ");
        }
    }
}