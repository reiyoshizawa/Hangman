package com.bignerdranch.android.hangman;

import android.graphics.Paint;

public class Line2 {

    private int left;
    private int top;
    private int bottom;
    private int right;
    private float[] ptsLeftFoot = {};
    private Paint bodyColor;

    public Line2() {
        Paint bodyColor = new Paint();
        bodyColor.setARGB(180, 0, 0, 180);
        bodyColor.setStyle(Paint.Style.FILL_AND_STROKE);
        bodyColor.setStyle(Paint.Style.FILL_AND_STROKE);
        this.left = 200;
        this.top = 50;
        this.bottom = 100;
        this.right = 800;
        this.ptsLeftFoot = new float[]{this.getLeft(),this.getTop(), this.getRight(), this.getBottom()};
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

    public float[] getPtsLeftFoot() {
        return ptsLeftFoot;
    }

    public void setPtsLeftFoot(float[] ptsLeftFoot) {
        this.ptsLeftFoot = ptsLeftFoot;
    }

    public Paint getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Paint bodyColor) {
        this.bodyColor = bodyColor;
    }
}
