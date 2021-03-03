package com.example.heshammidterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity3 extends ListActivity {
    Integer[] Animals = {R.drawable.cat4, R.drawable.cub2,
            R.drawable.deer8, R.drawable.jir1,R.drawable.wolf9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setListAdapter(new ArrayAdapter<Integer>(this, R.layout.activity_main3, R.id.t1, Animals));

    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position){
            case 0:
                startActivity(new Intent(MainActivity3.this, MainActivity4.class));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ehsan_team/")));
                break;

            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ehsan_team/")));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ehsan_team/")));
                break;

        }
    }

}