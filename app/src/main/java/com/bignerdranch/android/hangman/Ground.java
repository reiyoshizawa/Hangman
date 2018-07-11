package com.bignerdranch.android.hangman;

import android.graphics.Paint;

public class Ground {
    private int left;
    private int top;
    private int bottom;
    private int right;
    private Paint bodyColor;

    public Ground() {
        Paint bodyColor = new Paint();
        bodyColor.setARGB(180,0,0,180);
        bodyColor.setStyle(Paint.Style.FILL_AND_STROKE);
        this.left = 0;
        this.top = 800;
        this.bottom = 900;
        this.right = 1200;
        this.bodyColor = bodyColor;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public Paint getPaint() {
        return bodyColor;
    }

    public void setPaint(Paint paint) {
        this.bodyColor = paint;
    }
}
