package com.example.heshammidterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {
    MediaPlayer mp1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mp1 = MediaPlayer.create(this, R.raw.track1);
        mp1.start();

    }
}