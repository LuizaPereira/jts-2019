package com.luizapereira.coreengineering.tema11;

import java.util.Scanner;

public class Menu {

    private AnimalFactory animalFactory;

    public Menu() {
         animalFactory = new AnimalFactory();
    }

    public void initialize() {
        while (true) {

            System.out.println("\nWelcome to the Rescued Animals Center!");
            System.out.println("Please select an animal to rescue:\n");
            System.out.println("[CAT]");
            System.out.println("[DOG]");
            System.out.println("[PARROT]");

            Scanner scannerAnswer = new Scanner(System.in);
            Especies especies = Especies.valueOf(scannerAnswer.nextLine().toUpperCase());

            Animal animal = animalFactory.getAnimal(especies);

            animal.speak();

            System.out.println("Would you like to rescue another animal? Yes [Y] OR No [N]");
            String answer = scannerAnswer.nextLine();
            if(answer.equals("N")){
                System.exit(0);
            }
        }
    }

}
