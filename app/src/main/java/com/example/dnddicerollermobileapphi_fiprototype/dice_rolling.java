package com.example.dnddicerollermobileapphi_fiprototype;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.lang.*;
import java.util.*;

public class dice_rolling extends AppCompatActivity {
    private ConstraintLayout MainConstraintLayout;

    Random diceRoll = new Random();

    int dFour;
    int dSix;
    int dEight;
    int dTen;
    int dTwelve;
    int dTwenty;
    int dHundred;

    Vector<Integer> diceHistory = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dFourBtn;
        dFourBtn = (Button) findViewById(R.id.d4_btn);
        dFourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dFour = diceRoll.nextInt(4) + 1;
                //Code for animation
                diceHistory.add(dFour);
            }
        });

        Button dSixBtn;
        dSixBtn = (Button) findViewById(R.id.d6_btn);
        dSixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dSix = diceRoll.nextInt(6) + 1;
                //Code for animation
                diceHistory.add(dSix);
            }
        });

        Button dEightBtn;
        dEightBtn = (Button) findViewById(R.id.d8_btn);
        dEightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dEight = diceRoll.nextInt(8) + 1;
                //Code for animation
                diceHistory.add(dEight);
            }
        });

        Button dTenBtn;
        dTenBtn = (Button) findViewById(R.id.d10_btn);
        dTenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dTen = diceRoll.nextInt(10) + 1;
                //Code for animation
                diceHistory.add(dTen);
            }
        });

        Button dTwelveBtn;
        dTwelveBtn = (Button) findViewById(R.id.d12_btn);
        dTwelveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dTwelve = diceRoll.nextInt(12) + 1;
                //Code for animation
                diceHistory.add(dTwelve);
            }
        });

        Button dTwentyBtn;
        dTwentyBtn = (Button) findViewById(R.id.d20_btn);
        dTwentyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dTwenty = diceRoll.nextInt(20) + 1;
                //Code for animation
                diceHistory.add(dTwenty);
            }
        });

        /*
        Button dHundredBtn;
        dTwentyBtn = (Button) findViewById(R.id.d100_btn);
        dTwentyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dHundred = diceRoll.nextInt(100) + 1;
                //Code for animation
                diceHistory.add(dHundred);
            }
        });
        */
    }
}
