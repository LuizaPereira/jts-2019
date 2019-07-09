package com.luizapereira.coreengineering.tema7;

public class ArabicNumber {

    private static int[] arabicNumeral = { 10, 9, 5, 4, 1};
    private static String[] romanNumeral = { "X", "IX", "V", "IV", "I"};

    public String convertToRoman(int arabicNumber) throws IllegalArgumentException{

        String romanNumber = "";

        if(arabicNumber > 20)
        {
            throw new IllegalArgumentException("Please type a number between 1 - 20");
        }

        for (int i = 0; i < arabicNumeral.length; i++) {

            while (arabicNumber >= arabicNumeral[i]) {
                romanNumber += romanNumeral[i];
                arabicNumber -= arabicNumeral[i];
            }
        }
        return romanNumber;
    }
}
