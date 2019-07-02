package com.luizapereira.coreengineering.tema6;

import java.util.Scanner;

public class MenuAgenda {

    private Agenda agenda;
    private int id;

    public MenuAgenda() {
        agenda = new Agenda();
        id = 1;
    }

    public void initialize() {
        while (true) {
            System.out.println("Welcome to your Agenda!");
            System.out.println("Please select an action:\n");
            System.out.println("[A] Add a contact.");
            System.out.println("[R] Remove a contact.");
            System.out.println("[L] List all your contacts.");
            System.out.println("[S] Search for a contact.");
            System.out.println("[E] Exit.");

            Scanner scannerAction = new Scanner(System.in);
            String inputedAction = scannerAction.nextLine().toUpperCase();

            switch (inputedAction) {

                case "A":
                    addPerson();
                    break;
                case "R":
                    removePerson();
                    break;
                case "L":
                    listAllContacts();
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

    public void addPerson() {

        System.out.println("Please inform a name for the contact: ");
        Scanner scannerName = new Scanner(System.in);
        String inputedName = scannerName.nextLine();

        agenda.addPerson(inputedName);
    }

    public void removePerson() {

        System.out.println("Please select an id to remove");
        listAllContacts();
        Scanner scannerId = new Scanner(System.in);
        int inputedId = scannerId.nextInt();

        agenda.removePerson(inputedId);
    }

    public void listAllContacts() {
        for (Person p : agenda.listPersons()) {
            System.out.println(p.toString());
        }
    }

    public void searchForPerson() {
        System.out.println("Would you like to search by id or by name? [I = ID and N = name]");

        Scanner scannerAnswer = new Scanner(System.in);
        String answer = scannerAnswer.nextLine().toUpperCase();

        switch (answer) {
            case "I":
                System.out.println("Inform the id: ");
                Scanner scannerIdSearch = new Scanner(System.in);
                int inputedIdSearch = scannerIdSearch.nextInt();
                System.out.println(agenda.searchPersonById(inputedIdSearch));
                break;

            case "N":
                System.out.println("Inform the name:");
                Scanner scannerName = new Scanner(System.in);
                String inputedName = scannerName.nextLine();
                System.out.println(agenda.searchPersonByName(inputedName));
                break;
            default:
                System.out.println("Invalid option, please select again!\n ");
        }
    }
}
