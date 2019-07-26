package com.luizapereira.coreengineering.tema15;

public class Espresso extends BeverageMachine {

    @Override
    String putWater() {
        return "Water was served \n";
    }

    @Override
    String putCoffee() {
        return "Coffee was served\n";
    }

    @Override
    String serveBeverage() {
        return "Your Espresso is ready!";
    }
}