package com.luizapereira.coreengineering.tema18;

public class CheeseTopping extends Topping {
    private static final Double CHEESE_PRICE = 3D;

    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + CHEESE_PRICE;
    }
}
