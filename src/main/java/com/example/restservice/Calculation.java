package com.example.restservice;

public class Calculation {

    private final long id;
    private final String answer;
    public Calculation(long id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }
}