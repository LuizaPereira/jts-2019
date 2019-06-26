package com.luizapereira.coreengineering.tema5;

public class Main {

    public static void main(String[] args) {
        LedLamp ledLamp = new LedLamp();
        IncandescentLamp incandescentLamp = new IncandescentLamp();
        Interrupter interrupterLed = new Interrupter(ledLamp);
        Interrupter interrupterIncandescent = new Interrupter(incandescentLamp);

        System.out.println("A Lamp can have 2 states:");
        System.out.println("State False = OFF");
        System.out.println("State true = ON\n");

        System.out.println("The state of the Led lamp is : " + ledLamp.getState());
        System.out.println("The state of the Incandescent lamp is :" + incandescentLamp.getState() + "\n");

        System.out.println("Turning the switch on both lamps!\n");
        interrupterLed.lampSwitch();
        interrupterIncandescent.lampSwitch();

        System.out.println("\nThe final state of the Led lamp is now: " + ledLamp.getState());
        System.out.println("The final state of the Incandescent lamp is now: " + incandescentLamp.getState());
    }
}
