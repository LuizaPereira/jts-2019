package com.luizapereira.coreengineering.tema16;

public class PushNotificationHandler extends NotificationHandler {

    public PushNotificationHandler(NotificationHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(Request request) {
        if(Request.RequestType.PUSH.equals(request.getType())){
            System.out.println(request.getMessage() + "Message sent by PUSH\n");
        }
        dispatchToNext(request);
    }

    @Override
    public Request.RequestType getTypeNotificationHandler() {
        return Request.RequestType.PUSH;
    }
}