package com.example.dnddicerollermobileapphi_fiprototype;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;

public class collection_page extends AppCompatActivity {
    private ConstraintLayout ColConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection_page);

        Button color1;
        color1 = (Button)findViewById(R.id.color1);
        Button color2;
        color2 = (Button)findViewById(R.id.color2);
        Button color3;
        color3 = (Button)findViewById(R.id.color3);
        Button color4;
        color4 = (Button)findViewById(R.id.color4);
        Button color5;
        color5 = (Button)findViewById(R.id.color5);
        Button color6;
        color6 = (Button)findViewById(R.id.color6);
        Button color7;
        color7 = (Button)findViewById(R.id.color7);
        Button color8;
        color8 = (Button)findViewById(R.id.color8);
        Button color9;
        color9 = (Button)findViewById(R.id.color9);
        color1.setVisibility(View.GONE);
        color2.setVisibility(View.GONE);
        color3.setVisibility(View.GONE);
        color4.setVisibility(View.GONE);
        color5.setVisibility(View.GONE);
        color6.setVisibility(View.GONE);
        color7.setVisibility(View.GONE);
        color8.setVisibility(View.GONE);
        color9.setVisibility(View.GONE);
        ColConstraintLayout = (ConstraintLayout)findViewById(R.id.constraintLayoutCollection);

        ImageButton btnBack;
        btnBack = (ImageButton)findViewById(R.id.collection_back_btn);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainPage = new Intent(collection_page.this, MainActivity.class);
                startActivity(mainPage);
            }
        });

        Button btnDice;
        btnDice = (Button)findViewById(R.id.collection_dice_btn);
        btnDice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                color1.setVisibility(View.GONE);
                color2.setVisibility(View.GONE);
                color3.setVisibility(View.GONE);
                color4.setVisibility(View.GONE);
                color5.setVisibility(View.GONE);
                color6.setVisibility(View.GONE);
                color7.setVisibility(View.GONE);
                color8.setVisibility(View.GONE);
                color9.setVisibility(View.GONE);
            }
        });

        Button btnSounds;
        btnSounds = (Button)findViewById(R.id.collection_sounds_btn);
        btnSounds.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                color1.setVisibility(View.GONE);
                color2.setVisibility(View.GONE);
                color3.setVisibility(View.GONE);
                color4.setVisibility(View.GONE);
                color5.setVisibility(View.GONE);
                color6.setVisibility(View.GONE);
                color7.setVisibility(View.GONE);
                color8.setVisibility(View.GONE);
                color9.setVisibility(View.GONE);
            }
        });

        Button btnBg;
        btnBg = (Button)findViewById(R.id.collection_bg_btn);
        btnBg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                color1.setVisibility(View.VISIBLE);
                color2.setVisibility(View.VISIBLE);
                color3.setVisibility(View.VISIBLE);
                color4.setVisibility(View.VISIBLE);
                color5.setVisibility(View.VISIBLE);
                color6.setVisibility(View.VISIBLE);
                color7.setVisibility(View.VISIBLE);
                color8.setVisibility(View.VISIBLE);
                color9.setVisibility(View.VISIBLE);
            }
        });



        color1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ColConstraintLayout.setBackgroundColor(getResources().getColor(R.color.maroon));
            }
        });

        color2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ColConstraintLayout.setBackgroundColor(getResources().getColor(R.color.olive));
            }
        });

        color3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ColConstraintLayout.setBackgroundColor(getResources().getColor(R.color.crimson));
            }
        });

        color4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ColConstraintLayout.setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

        color5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ColConstraintLayout.setBackgroundColor(getResources().getColor(R.color.jasmine));
            }
        });

        color6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ColConstraintLayout.setBackgroundColor(getResources().getColor(R.color.teal));
            }
        });

        color7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ColConstraintLayout.setBackgroundColor(getResources().getColor(R.color.tuape));
            }
        });

        color8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ColConstraintLayout.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        color9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ColConstraintLayout.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });
    }
}