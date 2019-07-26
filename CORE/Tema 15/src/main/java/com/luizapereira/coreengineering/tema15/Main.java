package com.luizapereira.coreengineering.tema15;

public class Main {

    public static void main(String[] args) {

        BeverageMachine beverageMachine = new Espresso();
        System.out.println(beverageMachine.prepareBeverage());

        beverageMachine = new CoffeeWithMilk();
        System.out.println(beverageMachine.prepareBeverage());
    }
}