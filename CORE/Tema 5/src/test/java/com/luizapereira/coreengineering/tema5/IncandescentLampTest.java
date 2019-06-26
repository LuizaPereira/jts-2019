package com.luizapereira.coreengineering.tema5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IncandescentLampTest {

    public IncandescentLamp incandescentLamp;

    @Before
    public void initialize() {
        incandescentLamp = new IncandescentLamp();
    }

    @Test
    public void testCreateIncandescentLampWithStateOff() {
        Assert.assertEquals(false, incandescentLamp.getState());
    }

    @Test
    public void testTurnIncandescentLampOn() {
        incandescentLamp.turnOn();
        Assert.assertEquals(true, incandescentLamp.getState());
    }

    @Test
    public void testTurnIncandescentLampOff() {
        incandescentLamp.turnOff();
        Assert.assertEquals(false, incandescentLamp.getState());
    }
}
