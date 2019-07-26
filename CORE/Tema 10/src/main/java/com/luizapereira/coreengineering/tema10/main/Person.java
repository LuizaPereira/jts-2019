package com.luizapereira.coreengineering.tema10.main;

public class Person {

    private String name;
    private String email;
    private String phone;
    private int id;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Person() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    @Override
    public String toString() {

        return "Id: " + getId() + " - Name: " + getName() + " - Email: " + getEmail() + " - Phone: " + getPhone();
    }
}
