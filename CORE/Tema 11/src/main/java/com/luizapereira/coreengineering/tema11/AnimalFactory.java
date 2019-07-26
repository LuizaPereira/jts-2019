package com.luizapereira.coreengineering.tema11;

import com.luizapereira.coreengineering.tema11.exceptions.InvalidAnimalException;

public class AnimalFactory {

    public Animal getAnimal(Especies especies) throws InvalidAnimalException {
        switch (especies) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case PARROT:
                return new Parrot();
            default:
                throw new InvalidAnimalException();
        }
    }
}
