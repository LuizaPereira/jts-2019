package com.luizapereira.coreengineering.tema14;

public class Car implements Vehicle {

    @Override
    public double getFuelCapacity() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "5 seats and " + getFuelCapacity() + " of fuel capacity";
    }
}
