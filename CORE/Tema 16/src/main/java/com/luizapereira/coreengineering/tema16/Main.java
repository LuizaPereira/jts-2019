package com.luizapereira.coreengineering.tema16;

public class Main {

    public static void main(String[] args) {
        Request request = new Request();

        NotificationHandler smsHandler = new SMSNotificationHandler(null);
        NotificationHandler emailHandler = new EmailNotificationHandler(smsHandler);
        NotificationHandler pushNotification = new PushNotificationHandler(emailHandler);

        request.setType(Request.RequestType.PUSH);
        pushNotification.handleRequest(request);

        request.setType(Request.RequestType.EMAIL);
        pushNotification.handleRequest(request);

        request.setType(Request.RequestType.SMS);
        pushNotification.handleRequest(request);
    }
}