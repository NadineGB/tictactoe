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

        setSymbolStart();


    }

    public void setSymbol(View view) {

        ImageView symImageView = findViewById(R.id.s1img);

        symImageView.animate().translationYBy(100).rotationY(3 * 360).setDuration(1000);


    }

    public void setSymbolStart() {
        ImageView symbolImageView = findViewById(R.id.s1img);
        symbolImageView.setY(-100);
        symbolImageView = findViewById(R.id.s2img);
        symbolImageView.setY(-1000);
        symbolImageView = findViewById(R.id.s2img);
        symbolImageView.setY(-1000);
        symbolImageView = findViewById(R.id.s3img);
        symbolImageView.setY(-1000);
        symbolImageView = findViewById(R.id.s4img);
        symbolImageView.setY(-1000);
        symbolImageView = findViewById(R.id.s5img);
        symbolImageView.setY(-1000);
        symbolImageView = findViewById(R.id.s6img);
        symbolImageView.setY(-1000);
        symbolImageView = findViewById(R.id.s7img);
        symbolImageView.setY(-1000);
        symbolImageView = findViewById(R.id.s8img);
        symbolImageView.setY(-1000);
        symbolImageView = findViewById(R.id.s9img);
        symbolImageView.setY(-1000);
    }
}
