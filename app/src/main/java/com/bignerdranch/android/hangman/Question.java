package com.bignerdranch.android.hangman;

public class Question {
    private String q1;
    private String q2;
    private String q3;

    public Question() {
        this.q1 = "EASY";
        this.q2 = "NORMAL";
        this.q3 = "DIFFICULT";
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }
}
