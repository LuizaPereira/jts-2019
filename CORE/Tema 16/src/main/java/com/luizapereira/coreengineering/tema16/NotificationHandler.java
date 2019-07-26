package com.luizapereira.coreengineering.tema16;

import java.util.Objects;

public abstract class NotificationHandler {
    private NotificationHandler nextHandler;

    public NotificationHandler(NotificationHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract Request.RequestType getTypeNotificationHandler();

    public abstract void handleRequest(Request request);

    protected void dispatchToNext(Request request){
        if(Objects.nonNull(this.nextHandler)){
            this.nextHandler.handleRequest(request);
        }
    }
}