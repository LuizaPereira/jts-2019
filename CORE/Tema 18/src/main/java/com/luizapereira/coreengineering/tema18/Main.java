package com.luizapereira.coreengineering.tema18;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new PizzaDough();
        Pizza pizzaOrder = new PepperoniTopping(new CheeseTopping(new CheeseTopping(pizza)));
        System.out.println("Pepperoni pizza with double cheese costs R$ " + pizzaOrder.getPrice());
    }
}
