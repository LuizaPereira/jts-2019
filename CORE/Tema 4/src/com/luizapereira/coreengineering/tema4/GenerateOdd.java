package com.luizapereira.coreengineering.tema4;

import java.util.Random;

public class GenerateOdd implements Runnable {

    private Random random = new Random();

    @Override
    public void run() {

        while(true) {

            int randomValue = generateOddNumber();

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println("Odd Thread: " + randomValue);
        }
    }

    private int generateOddNumber() {
        return  random.nextInt((100) * 2) - 1;
    }
}
