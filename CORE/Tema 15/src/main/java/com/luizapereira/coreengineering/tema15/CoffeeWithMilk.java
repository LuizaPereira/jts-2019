package com.luizapereira.coreengineering.tema15;


public class CoffeeWithMilk extends BeverageMachine {
    @Override
    String putWater() {
        return "Milk was served\n";
    }

    @Override
    String putCoffee() {
        return "Coffee was served \n";
    }

    @Override
    String serveBeverage() {
        return "Your Coffee with Milk is ready!";
    }
}