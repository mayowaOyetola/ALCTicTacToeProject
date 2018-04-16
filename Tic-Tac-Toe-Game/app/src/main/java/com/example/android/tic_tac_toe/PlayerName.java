package com.example.android.tic_tac_toe;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PlayerName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);


    }

    public void submitName(View view) {
        EditText player1Name = (EditText) findViewById(R.id.player1);
        EditText player2Name = (EditText) findViewById(R.id.player2);
        EditText numberOfGames = (EditText) findViewById(R.id.numberOfG);
        String player1NameText = player1Name.getText().toString();
        String player2NameText = player2Name.getText().toString();
        String number = numberOfGames.getText().toString();

        if (number.length()>= 3) {
            number = "99";
            numberOfGames.setText(R.string.default_max_games);
        }
        if (number.equals("") || Integer.parseInt(number) <= 0) {
            numberOfGames.setText(R.string.default_min_games);
            number = "1";
        }

        if (player1NameText.equals("")) {
            player1NameText = "Player 1";
            player1Name.setText(R.string.player_1_default_name);
        }
        if (player2NameText.equals("")) {
            player2NameText = "Player 2";
            player2Name.setText(R.string.player_2_default_name);
        }
        Intent intent = new Intent(this, PlayGame.class);
        intent.putExtra("Player 1", player1NameText);
        intent.putExtra("Player 2", player2NameText);
        intent.putExtra("Number", number);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            finish();
        }
    }
}
