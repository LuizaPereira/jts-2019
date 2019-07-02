package com.luizapereira.coreengineering.tema6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AgendaTest {

    Agenda agenda;
    Person person, person2;

    @Before
    public void initialize(){
        agenda = new Agenda();
    }

    @Test
    public void testAddPerson(){
        person = new Person("Laura");
        agenda.addPerson(person);

        Assert.assertEquals(agenda.searchPersonById(person.getId()), person);
    }

    @Test
    public void testRemovePerson(){
        person = new Person("Laura");
        agenda.addPerson(person);
        person2 = new Person("Matthew");
        agenda.addPerson(person2);
        agenda.removePerson(person.getId());

        Assert.assertEquals(agenda.listPersons().size(),1);
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveEmptyList(){
        agenda.removePerson(1);
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveNonexistentPerson(){
        person = new Person("Laura");
        agenda.addPerson(person);
        agenda.removePerson(3);
    }

    @Test
    public void testListPersons(){
        person = new Person("Laura");
        agenda.addPerson(person);

        Assert.assertNotNull(agenda.listPersons());
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyListPersons(){
        agenda.listPersons();
    }

    @Test
    public void testSearchPersonByName(){
        person = new Person("Laura");
        agenda.addPerson(person);

        Assert.assertNotNull(agenda.searchPersonByName(person.getName()));
    }

    @Test(expected = NullPointerException.class)
    public void testSearchPersonByNonexistentName(){
        person = new Person("Laura");
        agenda.addPerson(person);

        agenda.searchPersonByName("Matthew");
    }

    @Test
    public void testSearchPersonById(){
        person = new Person("Laura");
        agenda.addPerson(person);

        Assert.assertNotNull(agenda.searchPersonById(person.getId()));
    }

    @Test
    public void testSearchPersonByNonexistentId() {
        person = new Person("Laura");
        agenda.addPerson(person);

        Assert.assertNull(agenda.searchPersonById(3));
    }
}
