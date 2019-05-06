package com.tosh.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswersActivity extends AppCompatActivity {
    private TextView mVegesTextView;
    private TextView mFruitsTextView;
    private TextView mPastTenseView;
    private TextView mAdjectiveTextView;
    private TextView mFirstNameTextView;
    private TextView mPastTenseVerbTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        mVegesTextView = (TextView) findViewById(R.id.vegesTextView);
        mFruitsTextView = (TextView) findViewById(R.id.fruitsTextView);
        mPastTenseView = (TextView) findViewById(R.id.pastTenseView);
        mAdjectiveTextView = (TextView) findViewById(R.id.adjectiveTextView);
        mFirstNameTextView = (TextView) findViewById(R.id.firstNameTextView);
        mPastTenseVerbTextView = (TextView) findViewById(R.id.pastTenseVerbTextView);


        Intent intent = getIntent();
        String vege = intent.getStringExtra("vege");
        String fruits = intent.getStringExtra("fruits");
        String pastTense = intent.getStringExtra("pastTense");
        String adjectives = intent.getStringExtra("adjectives");
        String firstNames = intent.getStringExtra("firstNames");
        String pastTenseVerbs = intent.getStringExtra("pastTenseVerbs");

        mVegesTextView.setText("Welcome to the " + vege);
        mFruitsTextView.setText(" Kingdom where Princess " + fruits);
        mPastTenseView.setText(pastTense + " With the ");
        mAdjectiveTextView.setText(adjectives);
        mFirstNameTextView.setText(firstNames +  " her kingdom");
        mPastTenseVerbTextView.setText(pastTenseVerbs);




    }
}
