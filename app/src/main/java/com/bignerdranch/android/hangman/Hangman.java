package com.bignerdranch.android.hangman;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class Hangman extends View{
//    private ArrayList<RainDrop> drops = new ArrayList<>();
    private int tick = 0;

    public Hangman(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint rainColor = new Paint();
        rainColor.setARGB(180,0,0,180);
        rainColor.setStrokeWidth(20);
        rainColor.setStyle(Paint.Style.FILL_AND_STROKE);

        @SuppressLint("DrawAllocation") Body body = new Body();
        @SuppressLint("DrawAllocation") Face face = new Face();
        @SuppressLint("DrawAllocation") Rect hbody = new Rect(body.getLeft(), body.getTop(),body.getRight(),body.getBottom());
        @SuppressLint("DrawAllocation") LeftFoot leftFoot = new LeftFoot();
        @SuppressLint("DrawAllocation") RightFoot rightFoot = new RightFoot();
        @SuppressLint("DrawAllocation") LeftHand leftHand = new LeftHand();
        @SuppressLint("DrawAllocation") RightHand rightHand = new RightHand();
        @SuppressLint("DrawAllocation") Ground ground = new Ground();
        @SuppressLint("DrawAllocation") Rect hground = new Rect(ground.getLeft(), ground.getTop(),ground.getRight(),ground.getBottom());
        @SuppressLint("DrawAllocation") Line1 line1 = new Line1();
        @SuppressLint("DrawAllocation") Line2 line2 = new Line2();

        canvas.drawCircle(face.getX(), face.getY(),face.getRadius(),face.getFaceColor());
        canvas.drawRect(hbody ,rainColor);
        canvas.drawLines(leftFoot.getPtsLeftFoot(), rainColor);
        canvas.drawLines(rightFoot.getPtsLeftFoot(), rainColor);
        canvas.drawLines(leftHand.getPtsLeftFoot(), rainColor);
        canvas.drawLines(rightHand.getPtsLeftFoot(), rainColor);
        canvas.drawRect(hground ,rainColor);
        canvas.drawLines(line1.getPtsLeftFoot(), rainColor);
        canvas.drawLines(line2.getPtsLeftFoot(), rainColor);

//        Rect rect2 = new Rect(10, 20, 30, 40);
//        canvas.drawRect(rect, rainColor);
//
//        RectF rectF = new RectF(40.5f, 20.5f, 60.5f, 40.5f);
//        canvas.drawRect(rectF, rainColor);

//
//        float rand = (float) Math.random() * canvas.getWidth();
//        tick++;
//
//        // add drop to the ArrayList
//        if (tick % 25 == 0) {
//            RainDrop rainDrop = new RainDrop(rand, 0, 10, rainColor);
//            drops.add(rainDrop);
//            System.out.println(drops.size());
//        }
//
//        // draw everything in the drops
//        for (RainDrop rainDrop : drops) {
//            rainDrop.setY(rainDrop.getY()+ 10);
//            canvas.drawCircle(rainDrop.getX(),rainDrop.getY(),rainDrop.getRadius(), rainDrop.getPaint());
//
    }

}
