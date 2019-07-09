package com.luizapereira.coreengineering.tema7;

public class RomanNumber {

    public int convertToArabic(String romanNumber) throws IllegalArgumentException{

        int arabicNumber = 0;
        int rightNumeral = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {

            int valor = (int) translateRomanNumeral(romanNumber.charAt(i));
            arabicNumber += valor * Math.signum(valor + 0.5 - rightNumeral);
            rightNumeral = valor;
        }
        return arabicNumber;
    }

    private double translateRomanNumeral(char character) throws IllegalArgumentException{

        String eachCharacter = Character.toString(character);

        if(!eachCharacter.matches("[IVXLCDM]*"))
        {
            throw new IllegalArgumentException("Type a valid roman number");
        }

        return Math.floor(Math.pow(10, "IXCM".indexOf(character)))
                + 5 * Math.floor(Math.pow(10, "VLD".indexOf(character)));
    }
}
