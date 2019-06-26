package com.luizapereira.coreengineering.tema5;

public class IncandescentLamp implements Lamp {

    private boolean state;

    public IncandescentLamp() {
        this.state = false;
    }

    @Override
    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("The incandescent lamp is on");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("The incandescent lamp is off");
    }
}
