package com.luizapereira.coreengineering.tema6;

public class Person {

    private String name;
    private int id;
    private static int aux = 1;

    public Person(String name) {
        this.name = name;
        this.id = aux;
        aux++;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {

        return "Id: " + getId() + " - Name: " + getName() + "\n";
    }
}

