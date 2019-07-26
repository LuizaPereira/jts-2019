package com.luizapereira.coreengineering.tema18;

public class PepperoniTopping extends Topping {
    private static final Double PEPPERONI_PRICE = 3.50;

    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getPrice(){
        return super.getPrice() + PEPPERONI_PRICE;
    }
}