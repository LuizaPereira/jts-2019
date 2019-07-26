package com.luizapereira.coreengineering.tema14;

public class Truck implements Vehicle {

    @Override
    public double getFuelCapacity() {
        return 500;
    }

    @Override
    public String getDescription() {
        return "3 seats and " + getFuelCapacity() + " of fuel capacity";
    }
}
