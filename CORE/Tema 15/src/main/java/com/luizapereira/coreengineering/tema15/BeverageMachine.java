package com.luizapereira.coreengineering.tema15;

public abstract class BeverageMachine {

    abstract String putWater();
    abstract String putCoffee();
    abstract String serveBeverage();

    public final String prepareBeverage(){
        return putWater() +
                putCoffee() +
                serveBeverage();
    }
}