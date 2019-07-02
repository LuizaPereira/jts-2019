package com.luizapereira.coreengineering.tema6;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Person> person;

    public Agenda() {
        this.person = new ArrayList<>();
    }

    public void addPerson(String name) {
        Person contact = new Person(name);
        this.person.add(contact);
    }

    public void removePerson(int id) {

        if(searchPersonById(id) == null){
            throw new NullPointerException("There is no contact whit this id, type a valid id");
        } else if(person.size() == 0) {
            throw new NullPointerException("There is no contact to remove");
        } else {
            person.remove(searchPersonById(id));
        }
    }

    public List<Person> listPersons() {

        if(person.isEmpty()){
            throw new NullPointerException("Contact List is empty, please add a contact first!");
        } else {
            return person;
        }
    }

    public List<Person> searchPersonByName(String personName) {

        List<Person> personAux = new ArrayList<>();

        for (Person p : person) {
            String aux = p.getName();
            if (personName.equals(aux) || p.getName().contains(personName)) {
                personAux.add(p);
            }
        }

        if(personAux.isEmpty()){
            throw new NullPointerException("There is no contact with this name");
        } else {
            return personAux;
        }
    }

    public Person searchPersonById(int personId) {

        for (Person person : person)
            if (personId == person.getId())
                return person;

        return null;
    }
}

