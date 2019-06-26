package com.luizapereira.coreengineering.tema4;

    public class Main {
        public static void main(String[] args) {

            Thread oddThread = new Thread(new GenerateEven());
            Thread evenThread = new Thread(new GenerateOdd());

            oddThread.start();
            evenThread.start();
        }
    }
