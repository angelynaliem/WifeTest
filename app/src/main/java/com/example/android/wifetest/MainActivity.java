package com.example.android.wifetest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText question_one;
    CheckBox question_two_one;
    CheckBox question_two_two;
    CheckBox question_two_three;
    RadioButton question_three_one;
    RadioButton question_three_two;
    RadioButton question_three_three;
    RadioButton question_four_one;
    RadioButton question_four_two;
    RadioButton question_four_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question_one = findViewById(R.id.question_one);
        question_two_one = findViewById(R.id.question_two_one);
        question_two_two = findViewById(R.id.question_two_two);
        question_two_three = findViewById(R.id.question_two_three);
        question_three_one = findViewById(R.id.question_three_one);
        question_three_two = findViewById(R.id.question_three_two);
        question_three_three = findViewById(R.id.question_three_three);
        question_four_one = findViewById(R.id.question_four_one);
        question_four_two = findViewById(R.id.question_four_two);
        question_four_three = findViewById(R.id.question_four_three);

    }

    public void getScore (View view) {

        EditText pickQuestionOne = question_one;
        Editable nameEditable = question_one.getText();
        String name = nameEditable.toString();

        boolean pickQuestionTwoOne = question_two_one.isChecked();
        boolean pickQuestionTwoTwo = question_two_two.isChecked();
        boolean pickQuestionTwoThree = question_two_three.isChecked();
        boolean pickQuestionThreeOne = question_three_one.isChecked();
        boolean pickQuestionThreeTwo = question_three_two.isChecked();
        boolean pickQuestionThreeThree = question_three_three.isChecked();
        boolean pickQuestionFourOne = question_four_one.isChecked();
        boolean pickQuestionFourTwo = question_four_two.isChecked();
        boolean pickQuestionFourThree = question_four_three.isChecked();

        int score = getFinalScore (pickQuestionOne, pickQuestionTwoOne,pickQuestionTwoTwo,pickQuestionTwoThree,pickQuestionThreeOne,pickQuestionThreeTwo, pickQuestionThreeThree, pickQuestionFourOne, pickQuestionFourTwo, pickQuestionFourThree);

        Context context = getApplicationContext();
        CharSequence text = "Darren, your score is" + score + "/5!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    private int getFinalScore(EditText pickQuestionOne, boolean pickQuestionTwoOne, boolean pickQuestionTwoTwo, boolean pickQuestionTwoThree, boolean pickQuestionThreeOne, boolean pickQuestionThreeTwo, boolean pickQuestionThreeThree, boolean pickQuestionFourOne, boolean pickQuestionFourTwo, boolean pickQuestionFourThree) {

        int score = 0;

        if (pickQuestionOne.getText().toString().equalsIgnoreCase("avelyn")) {
            score = score + 1;
        }

        if (pickQuestionTwoOne) {
            score = score + 1;
        }

        if (pickQuestionTwoTwo) {
            score = score + 0;
        }

        if (pickQuestionTwoThree) {
            score = score + 1;
        }

        if (pickQuestionThreeOne) {
            score = score + 0;
        }

        if (pickQuestionThreeTwo) {
            score = score + 1;
        }

        if (pickQuestionThreeThree) {
            score = score + 0;
        }

        if (pickQuestionFourOne) {
            score = score + 1;
        }

        if (pickQuestionFourTwo) {
            score = score + 0;
        }

        if (pickQuestionFourThree) {
            score = score + 0;
        }

        return score;
    }
}
