package com.luizapereira.coreengineering.tema7;

import kotlin.jvm.Throws;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int answer;
        int inputedArabicNumber = 0;
        int arabicNumberToRoman;
        String inputedRomanNumber;
        String romanNumberToArabic;
        String proceed = "Y";

        while(proceed.equals("Y")){

            System.out.println("Choose a Converter!");
            System.out.println("Type [0] to convert an arabic number to a roman number.");
            System.out.println("Type [1] to convert a roman number to an arabic number.");

            answer = input.nextInt();

            switch (answer){

                case 0:
                    ArabicNumber arabicNumber = new ArabicNumber();
                    System.out.println("Type an arabic number to convert (1 - 20): ");
                    inputedArabicNumber = input.nextInt();

                    romanNumberToArabic = arabicNumber.convertToRoman(inputedArabicNumber);
                    System.out.println("Converted arabic number (" + inputedArabicNumber + ") to Roman: " + romanNumberToArabic);
                    break;

                case 1:
                    RomanNumber romanNumber = new RomanNumber();
                    System.out.println("Type a roman number to convert (I - XX): ");
                    inputedRomanNumber = input.next().toUpperCase();

                    arabicNumberToRoman = romanNumber.convertToArabic(inputedRomanNumber);
                    System.out.println("Converted roman (" + inputedRomanNumber + ") to arabic: " + arabicNumberToRoman);
                    break;

                default:
                    throw new IllegalArgumentException("Choose a valid option...");
            }

            System.out.println("\nWould you like to convert another number? [Y/N]");
            proceed = input.next().toUpperCase();
        }
    }
}
