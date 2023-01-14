package com.example.dnddicerollermobileapphi_fiprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;

public class history_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_page);

        ImageButton btnBack;
        btnBack =(ImageButton)findViewById(R.id.history_back_btn);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainPage = new Intent(history_page.this, MainActivity.class);
                startActivity(mainPage);
            }
        });
    }
}