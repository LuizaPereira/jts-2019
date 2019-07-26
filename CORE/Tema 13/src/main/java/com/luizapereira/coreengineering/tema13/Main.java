package com.luizapereira.coreengineering.tema13;

import com.luizapereira.coreengineering.tema13.strategy.*;

public class Main {

        public static void main(String[] args) {

            AlertManager alertManager;
            Person person = new Person("Luiza", "luiza.pereira@ilegra.com");
            person.setPhone("(51) 99865-4551");

            System.out.println("Sending message by SMS");
            alertManager = new AlertManager(new SmsAlertStrategy(), person);
            alertManager.sendStrategy();

            System.out.println("Sending message by Email");
            alertManager = new AlertManager(new EmailAlertStrategy(), person);
            alertManager.sendStrategy();
        }
    }