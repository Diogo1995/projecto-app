package com.example.diogo.barraqueiro;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(Login.EXTRA_MESSAGE);

        // Set the welcome message as the string passed before
        TextView textView = findViewById(R.id.welcomeMessage);
        textView.setText(textView.getText() + " " + message);

        // Set the buttons
        ImageButton fillUpIcon = (ImageButton)findViewById(R.id.fillUpButton);
        fillUpIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fillUpActivity();
            }
        });

        ImageButton statsIcon = (ImageButton)findViewById(R.id.statsButton);
        statsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statsActivity();
            }
        });

        ImageButton mapsIcon = (ImageButton)findViewById(R.id.mapsButton);
        mapsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapsActivity();
            }
        });

        ImageButton contactsIcon = (ImageButton)findViewById(R.id.contactsButton);
        contactsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactsActivity();
            }
        });

        ImageButton settingsIcon = (ImageButton)findViewById(R.id.settingsButton);
        settingsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingsActivity();
            }
        });

        ImageButton logOutIcon = (ImageButton)findViewById(R.id.logOutButton);
        logOutIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void fillUpActivity(){
        Intent in = new Intent(this, FillUp.class);
        startActivity(in);
    }

    public void statsActivity(){
        Intent in = new Intent(this, Stats.class);
        startActivity(in);
    }

    public void mapsActivity(){
        Intent in = new Intent(this, Maps.class);
        startActivity(in);
    }

    public void contactsActivity(){
        Intent in = new Intent(this, Contacts.class);
        startActivity(in);
    }

    public void settingsActivity(){
        Intent in = new Intent(this, Settings.class);
        startActivity(in);
    }
}