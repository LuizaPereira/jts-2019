package com.luizapereira.coreengineering.tema6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    Person person;

    @Before
    public void initialize(){
        person = new Person("Laura");
    }

    @Test
    public void testGetName(){
        Assert.assertEquals(person.getName(),"Laura");
    }

    @Test
    public void testGetId(){
        Assert.assertEquals(person.getId(), 1);
    }
}
