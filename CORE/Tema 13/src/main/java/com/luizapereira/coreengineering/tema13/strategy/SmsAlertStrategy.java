package com.luizapereira.coreengineering.tema13.strategy;

public class SmsAlertStrategy implements AlertStrategy {

    @Override
    public String createAlert() {
        return "Alert sent by Sms";
    }
}