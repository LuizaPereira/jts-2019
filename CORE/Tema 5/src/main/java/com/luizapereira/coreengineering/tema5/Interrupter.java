package com.luizapereira.coreengineering.tema5;

public class Interrupter {

    private Lamp lamp;

    public Interrupter(Lamp lamp) {
        this.lamp = lamp;
    }

    public void lampSwitch() {
        if (lamp.getState()) {
            lamp.turnOff();
        } else {
            lamp.turnOn();
        }
    }
}
