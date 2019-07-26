package com.luizapereira.coreengineering.tema16;

public class SMSNotificationHandler extends NotificationHandler {

    public SMSNotificationHandler(NotificationHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if(Request.RequestType.SMS.equals(request.getType())){
            System.out.println(request.getMessage() + "Message sent by SMS\n");
        }
        dispatchToNext(request);
    }

    @Override
    public Request.RequestType getTypeNotificationHandler() {
        return Request.RequestType.SMS;
    }
}