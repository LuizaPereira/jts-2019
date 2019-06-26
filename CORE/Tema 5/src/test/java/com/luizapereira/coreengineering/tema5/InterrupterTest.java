package com.luizapereira.coreengineering.tema5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InterrupterTest {

    public LedLamp ledLamp;
    public IncandescentLamp incandescentLamp;
    public Interrupter interrupter;

    @Before
    public void initialize() {
        ledLamp = new LedLamp();
        incandescentLamp = new IncandescentLamp();
    }

    @Test
    public void testSwitchOnWhenLedLampOff() {
        ledLamp.turnOff();
        interrupter = new Interrupter(ledLamp);
        interrupter.lampSwitch();

        Assert.assertEquals(true, ledLamp.getState());
    }

    @Test
    public void testSwitchOffWhenLedLampOn() {
        ledLamp.turnOn();
        interrupter = new Interrupter(ledLamp);
        interrupter.lampSwitch();

        Assert.assertEquals(false, ledLamp.getState());
    }

    @Test
    public void testSwitchOnWhenIncandescentLampOff() {
        incandescentLamp.turnOff();
        interrupter = new Interrupter(incandescentLamp);
        interrupter.lampSwitch();

        Assert.assertEquals(true, incandescentLamp.getState());
    }

    @Test
    public void testSwitchOffWhenIncandescentLampOn() {
        incandescentLamp.turnOn();
        interrupter = new Interrupter(incandescentLamp);
        interrupter.lampSwitch();

        Assert.assertEquals(false, incandescentLamp.getState());
    }
}
