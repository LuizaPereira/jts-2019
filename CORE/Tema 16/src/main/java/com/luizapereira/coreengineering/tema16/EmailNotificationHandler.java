package com.luizapereira.coreengineering.tema16;

public class EmailNotificationHandler extends NotificationHandler {

    public EmailNotificationHandler(NotificationHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if(Request.RequestType.EMAIL.equals(request.getType())){
            System.out.println(request.getMessage() + "Message sent by EMAIL\n");
        }
        dispatchToNext(request);
    }

    @Override
    public Request.RequestType getTypeNotificationHandler() {
        return Request.RequestType.EMAIL;
    }
}