package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void dropIn(View view) {

        ImageView counter = (ImageView) view;

        counter.setTranslationY(-1500);

        counter.setImageResource(R.drawable.sun);

        counter.animate().translationYBy(1500).rotation(10 * 360).setDuration(1000);






    }


}
