package com.luizapereira.coreengineering.tema4;

import java.util.Random;

public class GenerateEven implements Runnable {

    private Random random = new Random();

    @Override
    public void run() {

        while (true) {

            int randomValue = generateEvenNumber();

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println("Even Thread: " + randomValue);
        }
    }

    private int generateEvenNumber() {
        return random.nextInt(100) * 2;
    }
}

