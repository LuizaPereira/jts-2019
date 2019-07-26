package com.luizapereira.coreengineering.tema16;

public class Request {
    private String message;
    private RequestType type;

    public enum RequestType{
        SMS, EMAIL, PUSH
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }
}