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

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(Login.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.welcomeMessage);
        textView.setText(textView.getText() + " " + message);


        ImageButton fillUpIcon = (ImageButton)findViewById(R.id.fillUpButton);
        fillUpIcon.setOnClickListener(this);

        ImageButton statsIcon = (ImageButton)findViewById(R.id.statsButton);
        statsIcon.setOnClickListener(this);

        ImageButton mapsIcon = (ImageButton)findViewById(R.id.mapsButton);
        mapsIcon.setOnClickListener(this);

        ImageButton contactsIcon = (ImageButton)findViewById(R.id.contactsButton);
        contactsIcon.setOnClickListener(this);

        ImageButton settingsIcon = (ImageButton)findViewById(R.id.settingsButton);
        settingsIcon.setOnClickListener(this);

        ImageButton logOutIcon = (ImageButton)findViewById(R.id.logOutButton);
        logOutIcon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        Intent intent;
        Button b = (Button) v;
        if (b.getId() == R.id.fillUpButton) {
            //intent = new Intent(this, FillUp.class);
            //startActivity(intent);
        } else if (b.getId() == R.id.statsButton) {
            //intent = new Intent(this, Stats.class);
            //startActivity(intent);
        } else if (b.getId() == R.id.mapsButton) {
            //intent = new Intent(this, Maps.class);
            //startActivity(intent);
        } else if (b.getId() == R.id.contactsButton) {
            //intent = new Intent(this, Contacts.class);
            //startActivity(intent);
        }else if (b.getId() == R.id.settingsButton) {
            intent = new Intent(this, Settings.class);
            startActivity(intent);
        }else if (b.getId() == R.id.logOutButton) {
            SharedPreferences sharedpreferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.clear();
            editor.commit();

            /*intent = new Intent(this, Login.class);

            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_down);
            finishAffinity();*/
        }
    }

}
