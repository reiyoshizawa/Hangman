package com.bignerdranch.android.hangman;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlphabetFragment extends Fragment implements View.OnClickListener {

    private Question q;
    private ArrayList<Question> questions;
//    private Button button;
    private TextView text;
    private TextView questionShows;
    private TextView questionShows2;
    private String string;

    public AlphabetFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_alphabet, container, false);

        // binding data from XML
        q = new Question();
        text = v.findViewById(R.id.text);
        questionShows = v.findViewById(R.id.questionShows);
        questionShows2 = v.findViewById(R.id.questionShows2);

        // randomly set question
//        text.setText(q.getQ1().toString());

        // click the alphabet keyboard and get each alphabet data
        setupButtons(v);

        // get char data of question randomly selected
        char c;
        string = q.getQ1();
        for (int i = 0; i < string.length(); i++) {
            c = string.charAt(i);
            text.setText(string);
        }

        return v;
    }

    CharSequence selectedChar;
    @Override
    public void onClick(View v) {
        Toast toast = Toast.makeText(getActivity(), ((Button) v).getText() , Toast.LENGTH_SHORT);
        selectedChar = ((Button) v).getText();
        System.out.println(selectedChar);
        toast.show();


        // if the alphabet you clicked is matched to question's alphabet it shows question's alphabet
        // If not, selected alphabet in keyboard is to be color changed and the graphic is shown
        isYourGuessCorrect();
    }

    private void isYourGuessCorrect() {
        String questionChar;
        for (int i = 0; i < string.length(); i++) {
            questionChar = String.valueOf(string.charAt(i));
            if (questionChar.equals(selectedChar)) {
                System.out.println("correct");
                String a1 = questionChar;
                questionShows.setText(a1);
                questionShows2.setText(a1);
            } else {
                System.out.println("wrong");
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
