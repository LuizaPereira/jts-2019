package com.luizapereira.coreengineering.tema5;

public class LedLamp implements Lamp {

    private boolean state;

    public LedLamp() {
        this.state = false;
    }

    @Override
    public boolean getState() {
        return state;
    }

    @Override
    public void turnOn() {
        state = true;
        System.out.println("The led lamp is on");
    }

    @Override
    public void turnOff() {
        state = false;
        System.out.println("The led lamp is off");
    }
}
