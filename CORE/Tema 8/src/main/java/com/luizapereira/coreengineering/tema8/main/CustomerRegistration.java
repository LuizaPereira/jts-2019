package com.luizapereira.coreengineering.tema8.main;

import com.luizapereira.coreengineering.tema8.persistence.PersonDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerRegistration {

    private List<Person> customers;
    private PersonDAO personDAO = new PersonDAO();

    public CustomerRegistration() {
        customers = new ArrayList<>();
    }

    public List<Person> getCustomers() {
        return customers;
    }

    public void addCustomer(Person person) {
        customers.add(person);
    }

    public Person searchPersonByName(String name) {
        Person auxPerson = null;
        if (!name.isEmpty()) {
            auxPerson = this.customers.stream().filter(person -> person.getName().equals(name)).findAny().orElse(null);
        }

        if(auxPerson != null){
            return auxPerson;
        }
        throw new NullPointerException("There is no customer with this name");
    }

    public void sortTop10() {
        Collections.sort(customers);
    }

    public void showDelayedBooks(){
        for (Person p: customers) {

            Map<String, Integer> delayedList = p.getDelayedLoans();

            if(!delayedList.isEmpty()) {
                System.out.println("\n"+ p.getName() + ":");
                delayedList.forEach((key, value) -> System.out.println("Book: "+ key + " - Delayed Days: " + value));
            }
        }
    }

    public void readPersonData() {
        customers = personDAO.readPersonData();
    }

    public void writePersonData() {
        personDAO.writePersonData(customers);
    }
}
