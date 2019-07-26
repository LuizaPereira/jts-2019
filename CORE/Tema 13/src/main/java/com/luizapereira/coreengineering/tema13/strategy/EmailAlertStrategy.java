package com.luizapereira.coreengineering.tema13.strategy;

public class EmailAlertStrategy implements AlertStrategy {

    @Override
    public String createAlert() {
        return "Alert sent by email";
    }
}