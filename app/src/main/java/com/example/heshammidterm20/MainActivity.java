package com.example.heshammidterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button first, second, third;
    MediaPlayer mp1;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = (Button) findViewById(R.id.button);
        second = (Button) findViewById(R.id.button2);
        third = (Button) findViewById(R.id.button3);

        mp1 = MediaPlayer.create(this, R.raw.track1);


        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    i++;
                    mp1.start();
                }
                else if(i==1){
                    i--;
                    mp1.stop();
                }


            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));

            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));

            }
        });

    }
}