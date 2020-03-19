package com.example.tictactoe;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int activePlayer = 1;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dropIn(View view) {

        ImageView counter = (ImageView) view;

        Log.i("Tag", counter.getTag().toString());

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        gameState[tappedCounter] = activePlayer;

        counter.setTranslationY(-1500);

        if (activePlayer == 0) {
            counter.setImageResource(R.drawable.ximg);
            activePlayer = 1;
        } else if (activePlayer == 1) {
            counter.setImageResource(R.drawable.sun);
            activePlayer = 0;
        }

        counter.animate().translationYBy(1500).rotation(10 * 360).setDuration(500);

        for (int[] winningPosition : winningPositions) {

            if (gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[0]] != 2) {

                String winner = "";

                if (activePlayer == 1) {
                    winner = "X";
                } else if (activePlayer == 0) {
                    winner = "Sun";
                }

                Toast.makeText(this, winner + " hat gewonnen", Toast.LENGTH_LONG).show();
            }

        }





    }


}
