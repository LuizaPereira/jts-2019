package com.luizapereira.coreengineering.tema8;

import com.luizapereira.coreengineering.tema8.main.CustomerRegistration;
import com.luizapereira.coreengineering.tema8.main.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerRegistrationTest {

    public CustomerRegistration customerRegistration;
    public Person person, person2;

    @Before
    public void initialize() {
        customerRegistration = new CustomerRegistration();
        person = new Person("4521222115", "LAURA");
        person2 = new Person("55211212211","MATTHEW");
        customerRegistration.addCustomer(person);
    }

    @Test
    public void testAddCustomer(){
        customerRegistration.addCustomer(person2);
        Assert.assertEquals(customerRegistration.getCustomers().size(),2);
    }

    @Test
    public void testGetCustomers(){
        Assert.assertEquals(customerRegistration.getCustomers().size(),1);
    }

    @Test
    public void testSearchPersonByName(){
        Assert.assertEquals(customerRegistration.searchPersonByName("LAURA"), person);
    }

    @Test(expected = NullPointerException.class)
    public void testSearchPersonByNonexistentName(){
        customerRegistration.searchPersonByName("CHLOE");
    }
}
