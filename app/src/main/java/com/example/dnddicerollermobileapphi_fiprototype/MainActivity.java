package com.example.dnddicerollermobileapphi_fiprototype;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout MainConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnSettings;
        btnSettings=(ImageButton)findViewById(R.id.settings_btn);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsPage = new Intent(MainActivity.this, settings_page.class);
                startActivity(settingsPage);
            }
        });

        ImageButton btnHistory;
        btnHistory=(ImageButton)findViewById(R.id.history_btn);
        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historyPage = new Intent(MainActivity.this, history_page.class);
                startActivity(historyPage);
            }
        });

        ImageButton btnCollection;
        btnCollection=(ImageButton)findViewById(R.id.collection_btn);
        btnCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent collectionPage;
                collectionPage = new Intent(MainActivity.this, collection_page.class);
                startActivity(collectionPage);
            }
        });
    }
}