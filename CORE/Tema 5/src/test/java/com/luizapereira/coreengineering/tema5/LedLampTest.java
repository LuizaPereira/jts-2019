package com.luizapereira.coreengineering.tema5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LedLampTest {

    public LedLamp ledLamp;

    @Before
    public void initialize() {
        ledLamp = new LedLamp();
    }

    @Test
    public void testCreateLedLampWithStateOff() {
        Assert.assertEquals(false, ledLamp.getState());
    }

    @Test
    public void testTurnIncandescentLampOn() {
        ledLamp.turnOn();
        Assert.assertEquals(true, ledLamp.getState());
    }

    @Test
    public void testTurnIncandescentLampOff() {
        ledLamp.turnOff();
        Assert.assertEquals(false, ledLamp.getState());
    }
}
