package com.example.dnddicerollermobileapphi_fiprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;

public class settings_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);

        CheckBox btnMusicToggle;
        btnMusicToggle = (CheckBox)findViewById(R.id.music_toggle_btn);
        CheckBox btnSFXToggle;
        btnSFXToggle = (CheckBox)findViewById(R.id.SFX_toggle_btn);
        SeekBar barMusicToggle;
        barMusicToggle = (SeekBar)findViewById(R.id.music_toggle_bar);
        SeekBar barSFXToggle;
        barSFXToggle = (SeekBar)findViewById(R.id.SFX_toggle_bar);
        btnMusicToggle.setVisibility(View.GONE);
        btnSFXToggle.setVisibility(View.GONE);
        barMusicToggle.setVisibility(View.GONE);
        barSFXToggle.setVisibility(View.GONE);

        TextView textViewAbout;
        textViewAbout = (TextView)findViewById(R.id.about_text_view);
        textViewAbout.setVisibility(View.GONE);


        ImageButton btnBack;
        btnBack = (ImageButton)findViewById(R.id.settings_back_btn);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainPage = new Intent(settings_page.this, MainActivity.class);
                startActivity(mainPage);
            }
        });

        Button btnGeneral;
        btnGeneral = (Button)findViewById(R.id.general_btn);
        btnGeneral.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnMusicToggle.setVisibility(View.GONE);
                btnSFXToggle.setVisibility(View.GONE);
                barMusicToggle.setVisibility(View.GONE);
                barSFXToggle.setVisibility(View.GONE);
                textViewAbout.setVisibility(View.GONE);
            }
        });

        Button btnAudio;
        btnAudio = (Button)findViewById(R.id.audio_btn);
        btnAudio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnMusicToggle.setVisibility(View.VISIBLE);
                btnSFXToggle.setVisibility(View.VISIBLE);
                barMusicToggle.setVisibility(View.VISIBLE);
                barSFXToggle.setVisibility(View.VISIBLE);
                textViewAbout.setVisibility(View.GONE);
            }
        });

        Button btnNotif;
        btnNotif = (Button)findViewById(R.id.notif_btn);
        btnNotif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnMusicToggle.setVisibility(View.GONE);
                btnSFXToggle.setVisibility(View.GONE);
                barMusicToggle.setVisibility(View.GONE);
                barSFXToggle.setVisibility(View.GONE);
                textViewAbout.setVisibility(View.GONE);
            }
        });

        Button btnAbout;
        btnAbout = (Button)findViewById(R.id.about_btn);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textViewAbout.setVisibility(View.VISIBLE);
                btnMusicToggle.setVisibility(View.GONE);
                btnSFXToggle.setVisibility(View.GONE);
                barMusicToggle.setVisibility(View.GONE);
                barSFXToggle.setVisibility(View.GONE);
            }
        });
    }
}