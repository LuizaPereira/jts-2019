package com.luizapereira.coreengineering.tema13;

import com.luizapereira.coreengineering.tema13.strategy.AlertStrategy;

public class AlertManager {

    private AlertStrategy alertStrategy;
    private static InitialMessage initialMessage = new InitialMessage();
    private Person person;

    public AlertManager(AlertStrategy alertStrategy, Person person) {
        this.alertStrategy = alertStrategy;
        this.person = person;
    }

    public void sendStrategy() {
        System.out.println(this.initialMessage.firstMessage(this.person));
        System.out.println(alertStrategy.createAlert());
    }
}