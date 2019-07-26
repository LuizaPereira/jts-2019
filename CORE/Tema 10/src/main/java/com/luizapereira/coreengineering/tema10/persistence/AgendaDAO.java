package com.luizapereira.coreengineering.tema10.persistence;

import com.luizapereira.coreengineering.tema10.exceptions.NonexistentPersonException;
import com.luizapereira.coreengineering.tema10.main.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AgendaDAO {

    public void addPerson(Person person) {
        if(isValidPerson(person)) {
            try (Connection connection = DatabaseConnection.openConnection();
                 PreparedStatement stmt = connection.prepareStatement("INSERT INTO contact (namePerson, phonePerson, emailPerson) VALUES (?, ?, ?);");) {
                stmt.setString(1, person.getName());
                stmt.setString(2, person.getPhone());
                stmt.setString(3, person.getEmail());
                stmt.executeUpdate();
                System.out.println("Person added!");
            } catch (SQLException e) {
                throw new NonexistentPersonException("Fail to add person");
            }
        }
        throw new NonexistentPersonException("Please review the data inputed");
    }

    private boolean isValidPerson(Person person) {
        return (!person.getName().isEmpty() && person.getPhone().split("").length >= 9
                && person.getEmail().contains("@"));
    }

    public List<Person> listPersonsByName() {
        List<Person> personList = new ArrayList<>();
        try (Connection connection = DatabaseConnection.openConnection();
             PreparedStatement stmt = connection.prepareStatement("SELECT * FROM contact ORDER BY namePerson ASC");){
            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Person person = new Person();
                    person.setId(rs.getInt("idPerson"));
                    person.setName(rs.getString("namePerson"));
                    person.setPhone(rs.getString("phonePerson"));
                    person.setEmail(rs.getString("emailPerson"));
                    personList.add(person);
                }
            }
        } catch (SQLException e) {
            throw new NonexistentPersonException("Please review the data inputed");
        }
        return personList;
    }

    public List<Person> listPersonsByID() {
        List<Person> personList = new ArrayList<>();
        try (Connection connection = DatabaseConnection.openConnection();
             PreparedStatement stmt = connection.prepareStatement("SELECT * FROM contact ORDER BY idPerson ASC");){
            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Person person = new Person();
                    person.setId(rs.getInt("idPerson"));
                    person.setName(rs.getString("namePerson"));
                    person.setPhone(rs.getString("phonePerson"));
                    person.setEmail(rs.getString("emailPerson"));
                    personList.add(person);
                }
            }
        } catch (SQLException e) {
            throw new NonexistentPersonException("Please review the data inputed");
        }
        return personList;
    }

    public void removePerson(int idPerson) {
        try (Connection connection = DatabaseConnection.openConnection();
             PreparedStatement stmt = connection.prepareStatement("DELETE FROM contact WHERE idPerson = ?;");){
            stmt.setInt(1, idPerson);
            stmt.executeUpdate();
            System.out.println("Person deleted!");
        } catch (SQLException e) {
            throw new NonexistentPersonException("Person not found!");
        }
    }

    public Person searchPersonByID(int idPerson) {
        Person person = new Person();
        try (Connection connection = DatabaseConnection.openConnection();
             PreparedStatement stmt = connection.prepareStatement("SELECT * FROM contact WHERE idPerson = ?;");){
            stmt.setInt(1, idPerson);
            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    person.setId(rs.getInt("idPerson"));
                    person.setName(rs.getString("namePerson"));
                    person.setPhone(rs.getString("phonePerson"));
                    person.setEmail(rs.getString("emailPerson"));
                }
            }
        } catch (SQLException e) {
            throw new NonexistentPersonException("Person not found!");
        }
        if (person.getId() == 0) {
            throw new NonexistentPersonException("Person not found!");
        }
        return person;
    }

    public Person searchPersonByName(String name) {
        Person person = new Person();
        try (Connection connection = DatabaseConnection.openConnection();
             PreparedStatement stmt = connection.prepareStatement("SELECT * FROM contact WHERE namePerson = ?;");){
            stmt.setString(1, name);
            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    person.setId(rs.getInt("idPerson"));
                    person.setName(rs.getString("namePerson"));
                    person.setPhone(rs.getString("phonePerson"));
                    person.setEmail(rs.getString("emailPerson"));
                }
            }
        } catch (SQLException e) {
            throw new NonexistentPersonException("Person not found!");
        }
        if (person.getId() == 0) {
            throw new NonexistentPersonException("Person not found!");
        }
        return person;
    }
}