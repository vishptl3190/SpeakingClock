package com.wisdomleaf.SpeakingClock.bean;

public class RequestBean {

    private String input_time;

    public String getInput_time() {
        return input_time;
    }

    public void setInput_time(String input_time) {
        this.input_time = input_time;
    }

    @Override
    public String toString() {
        return "RequestBean{" +
                "input_time='" + input_time + '\'' +
                '}';
    }
}
