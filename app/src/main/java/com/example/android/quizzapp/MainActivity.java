package com.example.android.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText employee;
    String typedText;
    int score = 0;
    int clickCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonQ1Click(View view) {
        RadioButton geyser = (RadioButton) findViewById(R.id.geyser);
        RadioButton supervolcano = (RadioButton) findViewById(R.id.supervolcano);
        RadioButton mountain = (RadioButton) findViewById(R.id.mountain);

        if (supervolcano.isChecked()) {
            score++;
        }
    }

    public void onRadioButtonQ3Click(View view) {
        RadioButton a1 = (RadioButton) findViewById(R.id.a1);
        RadioButton a2 = (RadioButton) findViewById(R.id.a2);
        RadioButton a3 = (RadioButton) findViewById(R.id.a3);
        RadioButton a4 = (RadioButton) findViewById(R.id.a4);
        RadioButton a5 = (RadioButton) findViewById(R.id.a5);

        if (a4.isChecked()) {
            score++;
        }
    }

    public void onCheckBoxQ2Click(View view) {
        CheckBox wyoming = (CheckBox) findViewById(R.id.wyoming);
        CheckBox idaho = (CheckBox) findViewById(R.id.idaho);
        CheckBox montana = (CheckBox) findViewById(R.id.montana);
        CheckBox colorado = (CheckBox) findViewById(R.id.colorado);
        CheckBox utah = (CheckBox) findViewById(R.id.utah);

        if (wyoming.isChecked() & idaho.isChecked() & montana.isChecked()) {
            score++;
        }
    }

    public void onScoreButton1Click(View view) {
        employee = (EditText) findViewById(R.id.employee);
        typedText = employee.getText().toString();
        clickCounter++;

        if (typedText.toLowerCase().equals("ranger")) {
            score++;
        }

        if (clickCounter == 1) {
            Toast.makeText(this, getString(R.string.toast_start) + String.valueOf(score) + getString(R.string.toast_end), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.too_many_clicks), Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void onScoreButton2Click(View view) {
        clickCounter = 0;
        score = 0;

        RadioGroup radioGroupOne = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroupOne.clearCheck();

        CheckBox wyoming1 = (CheckBox) findViewById(R.id.wyoming);
        wyoming1.setChecked(false);

        CheckBox montana1 = (CheckBox) findViewById(R.id.montana);
        montana1.setChecked(false);

        CheckBox idaho1 = (CheckBox) findViewById(R.id.idaho);
        idaho1.setChecked(false);

        CheckBox utah1 = (CheckBox) findViewById(R.id.utah);
        utah1.setChecked(false);

        CheckBox colorado1 = (CheckBox) findViewById(R.id.colorado);
        colorado1.setChecked(false);

        RadioGroup radioGroupTwo = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroupTwo.clearCheck();

        EditText ranger = (EditText) findViewById(R.id.employee);
        ranger.getText().clear();
    }
}
