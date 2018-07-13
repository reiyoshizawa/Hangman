package com.bignerdranch.android.hangman;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Hangman cv;
    private AnimationHelper animationHelper;
    private static AlphabetFragment alphabetFragment;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            transaction.add(R.id.container, new AlphabetFragment());
            transaction.commit();
        }

        if (savedInstanceState == null) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            transaction.add(R.id.container, new HangmanFragment());
            transaction.commit();
        }

//        cv = findViewById(R.id.hangman);


    }

    public void start(View view) {
        animationHelper.start();
    }

    public void stop(View view) {
        animationHelper.stop();
    }

//    public void startMoving() {
//        final Raindrop cv = findViewById(R.id.raindrop);
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                // run code on a different thread.
//                while (true) {
//                    try {
//                        // 1000 msec : 1 sec
//                        // 50 msec : 0.02 sec (50 fps)
//                        Thread.sleep(50);
//                        cv.postInvalidate(); // redraw the view (call onDraw)
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//
//        thread.start();
//
//    }



    public void clickrerereButton(android.view.View view) {
    }

}
