package com.luizapereira.coreengineering.tema18;

public abstract class Topping implements Pizza{

    private Pizza pizza;

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice();
    }
}