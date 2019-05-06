package com.tosh.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MadLibsActivity extends AppCompatActivity {
    private Button playTwo;
    private EditText veges;
    private EditText fruit;
    private EditText pastTense;
    private EditText adjective;
    private EditText firstName;
    private EditText pastTenseVerb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);

        veges = (EditText) findViewById(R.id.vegesTextView);
        fruit = (EditText) findViewById(R.id.fruit);
        pastTense = (EditText) findViewById(R.id.past_tense);
        adjective = (EditText) findViewById(R.id.adjective);
        firstName = (EditText) findViewById(R.id.firstName);
        pastTenseVerb = (EditText) findViewById(R.id.past_tense_verb);
        playTwo = (Button) findViewById(R.id.playTwo);

        playTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vege = veges.getText().toString();
                String fruits = fruit.getText().toString();
                String pastTenses = pastTense.getText().toString();
                String adjectives = adjective.getText().toString();
                String firstNames = firstName.getText().toString();
                String pastTenseVerbs = pastTenseVerb.getText().toString();

                Intent intent = new Intent(MadLibsActivity.this, AnswersActivity.class);
                intent.putExtra("vege", vege);
                intent.putExtra("fruits", fruits);
                intent.putExtra("pastTense", pastTenses);
                intent.putExtra("adjectives", adjectives);
                intent.putExtra("firstNames", firstNames);
                intent.putExtra("pastTenseVerbs", pastTenseVerbs);
                startActivity(intent);
            }
        });


    }
}
