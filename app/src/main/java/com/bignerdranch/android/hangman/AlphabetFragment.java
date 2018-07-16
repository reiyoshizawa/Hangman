package com.bignerdranch.android.hangman;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.constraint.solver.widgets.Rectangle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlphabetFragment extends Fragment implements View.OnClickListener{

    private Question questions;
    private String question;
    private TextView text_answer;
    private ArrayList<TextView> text_answer_array;
    ImageView imageViewRope;
    ImageView imageViewFace;
    ImageView imageViewBody;
    ImageView imageViewHand;
    ImageView imageViewLegs;
    ImageView imageViewFoot;
    ArrayList<ImageView> arrayList;
    private int counter = 0;
    Button selectedButton;

    public AlphabetFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_alphabet, container, false);

        // click the alphabet keyboard and get each alphabet data
        setupButtons(v);

        // get char data of question randomly selected
//        Random random = new Random();
//        String questionAllSize = question.getQuestion().toString();
//        int randomNum = random.nextInt(questionAllSize);
//        string = question.getQuestion().get(0);
//        System.out.println(string);
        questions = new Question();
        question = questions.getQ1();

        // make blank TextView as same size of question string size and show it
        LinearLayout answerBlank = v.findViewById(R.id.answerBlank);
        text_answer_array = new ArrayList<>();
        for (int i = 0; i < question.length(); i++) {
            text_answer = new TextView(getContext());
            text_answer.setId(i);
            text_answer.setText("_");
            text_answer.setTextSize(40);
            text_answer.setTextColor(Color.MAGENTA);
            text_answer.setPadding(0, 0, 20, 0);
            answerBlank.addView(text_answer);
            text_answer_array.add(text_answer);
        }

        // set background image
        LinearLayout hangmanBlank = v.findViewById(R.id.hangmanBlank);
        imageViewRope = new ImageView(getContext());
        imageViewRope.setX(310);
        imageViewRope.setY(340);
        imageViewFace = new ImageView(getContext());
        imageViewFace.setX(310);
        imageViewFace.setY(370);
        imageViewBody = new ImageView(getContext());
        imageViewBody.setX(200);
        imageViewBody.setY(420);
        imageViewHand = new ImageView(getContext());
        imageViewHand.setX(200);
        imageViewHand.setY(530);
        imageViewLegs = new ImageView(getContext());
        imageViewLegs.setX(0);
        imageViewLegs.setY(560);
        imageViewFoot = new ImageView(getContext());
        imageViewFoot.setX(-60);
        imageViewFoot.setY(670);

        hangmanBlank.addView(imageViewRope);
        hangmanBlank.addView(imageViewFace);
        hangmanBlank.addView(imageViewBody);
        hangmanBlank.addView(imageViewHand);
        hangmanBlank.addView(imageViewLegs);
        hangmanBlank.addView(imageViewFoot);

        arrayList = new ArrayList<>();
        arrayList.add(imageViewRope);
        arrayList.add(imageViewBody);
        arrayList.add(imageViewFace);
        arrayList.add(imageViewFoot);
        arrayList.add(imageViewHand);
        arrayList.add(imageViewLegs);

        return v;

    }

    @Override
    public void onClick(View v) {
//        Toast toast = Toast.makeText(getActivity(), ((Button) v).getText() , Toast.LENGTH_SHORT);
//        toast.show();
        String selectedWord = ((Button) v).getText().toString();

        // if the alphabet you clicked is matched to question's alphabet it shows question's alphabet
        // If not, selected alphabet in keyboard is to be color changed and the graphic is shown
        isYourGuessCorrect(selectedWord);

        if (counter == 6) {
            Intent intent = new Intent();
            intent.putExtra("data", counter);
            startActivity(intent);
        }
    }

    public void isYourGuessCorrect(String selectedWord) {
        ArrayList<Integer> indexes = new ArrayList<>();
        String  toUpperCase = question.toUpperCase();
        for (int i = 0; i < question.length(); i++) {
            if (toUpperCase.substring(i, i+1).equals(selectedWord)) {
                counter --;
                indexes.add(i);
            } else {

            }
        }

        showHangman();

        for(int i = 0; i < indexes.size(); i++) {
            int right = indexes.get(i);
            TextView tv = text_answer_array.get(right);
            if (tv.getText().toString().equals("_")) {
                tv.setText(selectedWord);
                Toast.makeText(getActivity(), "correct", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void showHangman() {
        counter++;
        switch (counter) {
            case 1 :
                imageViewRope.setImageResource(R.drawable.rope);
                break;
            case 2 :
                imageViewFace.setImageResource(R.drawable.face);
                break;
            case 3 :
                imageViewBody.setImageResource(R.drawable.body);
                break;
            case 4 :
                imageViewHand.setImageResource(R.drawable.hand);
                break;
            case 5 :
                imageViewLegs.setImageResource(R.drawable.legs);
                break;
            case 6 :
                imageViewFoot.setImageResource(R.drawable.foot);
                break;
        }
    }

    private void setupButtons(View v) {
        v.findViewById(R.id.button_a).setOnClickListener(this);
        v.findViewById(R.id.button_b).setOnClickListener(this);
        v.findViewById(R.id.button_c).setOnClickListener(this);
        v.findViewById(R.id.button_d).setOnClickListener(this);
        v.findViewById(R.id.button_e).setOnClickListener(this);
        v.findViewById(R.id.button_f).setOnClickListener(this);
        v.findViewById(R.id.button_g).setOnClickListener(this);
        v.findViewById(R.id.button_h).setOnClickListener(this);
        v.findViewById(R.id.button_i).setOnClickListener(this);
        v.findViewById(R.id.button_j).setOnClickListener(this);
        v.findViewById(R.id.button_k).setOnClickListener(this);
        v.findViewById(R.id.button_l).setOnClickListener(this);
        v.findViewById(R.id.button_m).setOnClickListener(this);
        v.findViewById(R.id.button_n).setOnClickListener(this);
        v.findViewById(R.id.button_o).setOnClickListener(this);
        v.findViewById(R.id.button_p).setOnClickListener(this);
        v.findViewById(R.id.button_q).setOnClickListener(this);
        v.findViewById(R.id.button_r).setOnClickListener(this);
        v.findViewById(R.id.button_s).setOnClickListener(this);
        v.findViewById(R.id.button_t).setOnClickListener(this);
        v.findViewById(R.id.button_u).setOnClickListener(this);
        v.findViewById(R.id.button_v).setOnClickListener(this);
        v.findViewById(R.id.button_w).setOnClickListener(this);
        v.findViewById(R.id.button_x).setOnClickListener(this);
        v.findViewById(R.id.button_y).setOnClickListener(this);
        v.findViewById(R.id.button_z).setOnClickListener(this);
    }
}
