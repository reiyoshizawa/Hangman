package com.bignerdranch.android.hangman;

import android.graphics.Paint;

public class Body {
    private int left;
    private int top;
    private int bottom;
    private int right;
    private Paint bodyColor;

    public Body() {
        Paint bodyColor = new Paint();
        bodyColor.setARGB(180,0,0,180);
        bodyColor.setStyle(Paint.Style.FILL_AND_STROKE);
        this.left = 730;
        this.top = 300;
        this.bottom = 550;
        this.right = 870;
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
