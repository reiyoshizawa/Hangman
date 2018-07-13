package com.bignerdranch.android.hangman;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.solver.widgets.Rectangle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlphabetFragment extends Fragment implements View.OnClickListener {

    private Question question;
    private TextView text_answer;
    private ArrayList<TextView> text_answer_array;
    private String string;
    private TextView text;

    public AlphabetFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_alphabet, container, false);

//        LinearLayout hangmanBlank = v.findViewById(R.id.hangmanBlock);
//        TextView textView = new TextView(getContext());
//        textView.setText("aaa");
//        hangmanBlank.addView(textView);

        // binding data from XML

        // click the alphabet keyboard and get each alphabet data
        setupButtons(v);

        // get char data of question randomly selected
//        Random random = new Random();
//        String questionAllSize = question.getQuestion().toString();
//        int randomNum = random.nextInt(questionAllSize);
//        string = question.getQuestion().get(0);
//        System.out.println(string);
        question = new Question();
        string = question.getQ1();

        // make blank TextView as same size of question string size and show it
        LinearLayout answerBlank = v.findViewById(R.id.answerBlank);
        text_answer_array = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            text_answer = new TextView(getContext());
            text_answer.setId(i);
            text_answer.setText("_");
            text_answer.setTextSize(40);
            text_answer.setTextColor(Color.MAGENTA);
            text_answer.setPadding(0, 0, 20, 0);
            answerBlank.addView(text_answer);
            text_answer_array.add(text_answer);
        }

        return v;

    }

    @Override
    public void onClick(View v) {
        Toast toast = Toast.makeText(getActivity(), ((Button) v).getText() , Toast.LENGTH_SHORT);
        String selectedWord = ((Button) v).getText().toString();
        toast.show();

        // if the alphabet you clicked is matched to question's alphabet it shows question's alphabet
        // If not, selected alphabet in keyboard is to be color changed and the graphic is shown
        isYourGuessCorrect(selectedWord);
    }

    public void isYourGuessCorrect(String selectedWord) {
        int counter = 0;

        ArrayList<Integer> indexes = new ArrayList<>();
        String  toUpperCase = string.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            if (toUpperCase.substring(i, i+1).equals(selectedWord)) {
                indexes.add(i);
            } else {
                counter = counter + 1;
            }
        }

        for(int i = 0; i < indexes.size(); i++) {
            int right = indexes.get(i);
            TextView tv = text_answer_array.get(right);
            if (tv.getText().toString().equals("_")) {
                tv.setText(selectedWord);
            }
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
