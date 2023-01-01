package com.wisdomleaf.SpeakingClock.bean;

public class ResponseBean {

    private String message;
    private int errorCode;
    private String errorMessage;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "message='" + message + '\'' +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
