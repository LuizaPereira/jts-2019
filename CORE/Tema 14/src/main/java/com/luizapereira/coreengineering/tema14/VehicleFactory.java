package com.luizapereira.coreengineering.tema14;

public class VehicleFactory {

    private VehicleFactory(){}

    private static VehicleFactory INSTANCE;

    public static VehicleFactory getInstance(){
        if(INSTANCE == null){
            synchronized (VehicleFactory.class){
                if(INSTANCE == null){
                    INSTANCE = new VehicleFactory();
                }
            }
        }
        return INSTANCE;
    }

    public Vehicle getType(String type){
        Vehicle vehicle;
        switch (type){
            case "TRUCK":
                vehicle = new Truck();
                break;
            case "CAR":
                vehicle = new Car();
                break;
            default:
                throw new IllegalArgumentException("Vehicle not found");
        }
        return vehicle;
    }
}
