package com.example.kingdom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int army = 0, people = 0, weeks = 1, heirs = 0;
    private float aliveChance = 100.0f, gold = 0.0f, income = 0.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateAll();
    }

    private void updateAll() {
        showAliveChance();
        showArmy();
        showGold();
        showHeirs();
        showIncome();
        showPeople();
        showTime();
    }

    private void showAliveChance() {
        TextView textView = (TextView) findViewById(R.id.alive_chance);
        String string = "" + aliveChance;
        textView.setText(string);
    }

    private void showIncome() {
        TextView textView = (TextView) findViewById(R.id.income);
        String string = "" + income;
        textView.setText(string);
    }

    private void showHeirs() {
        TextView textView = (TextView) findViewById(R.id.heirs);
        String string = "" + heirs;
        textView.setText(string);
    }

    private void showArmy() {
        TextView textView = (TextView) findViewById(R.id.army);
        String string = "" + army;
        textView.setText(string);
    }

    private void showGold() {
        TextView textView = (TextView) findViewById(R.id.gold);
        String string = "" + gold;
        textView.setText(string);
    }

    private void showPeople() {
        TextView textView = (TextView) findViewById(R.id.people);
        String string = "" + people;
        textView.setText(string);
    }

    private void showTime() {
        int years = 1, months = 1;

        if (weeks > 48) {
            years += weeks / 48;
            weeks -= (years - 1) * 48;
        }

        if (weeks > 4) {
            months += weeks / 4;
            weeks -= (months - 1) * 4;
        }

        TextView textView = (TextView) findViewById(R.id.time);
        String string = years + " Y  " + months + " M  " + weeks + " W";
        textView.setText(string);
    }
}