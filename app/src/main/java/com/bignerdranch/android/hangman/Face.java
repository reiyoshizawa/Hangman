package com.bignerdranch.android.hangman;

import android.graphics.Paint;

public class Face {
    private int x;
    private int y;
    private int radius;
    private Paint faceColor;

    public Face() {
        Paint faceColor = new Paint();
        faceColor.setARGB(180,0,0,180);
        faceColor.setStyle(Paint.Style.FILL_AND_STROKE);
        this.x = 800;
        this.y = 240;
        this.radius = 100;
        this.faceColor = faceColor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Paint getFaceColor() {
        return faceColor;
    }

    public void setFaceColor(Paint faceColor) {
        this.faceColor = faceColor;
    }
}
