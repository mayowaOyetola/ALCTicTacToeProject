package com.example.android.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playWithComputer(View view) {
        Intent playerNameWithComputer = new Intent(this, PlayerNameWithComputer.class);
        if (playerNameWithComputer.resolveActivity(getPackageManager()) != null) {
            startActivity(playerNameWithComputer);
        }
    }

    public void playWithPlayer(View view) {
        Intent playerNames= new Intent(this, PlayerName.class);
        if (playerNames.resolveActivity(getPackageManager()) != null) {
            startActivity(playerNames);
        }

    }


}