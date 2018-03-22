package com.example.diogo.barraqueiro;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Switch;

public class Settings extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Ver o estado da switch
        Switch darkModeSwitch = (Switch) findViewById(R.id.darkModeSwitch);
        Boolean darkModeSwitchState = darkModeSwitch.isChecked();
        // TODO alterar cores

        // TODO acrescentar  restantes botões e coisas - https://stackoverflow.com/questions/13377361/how-to-create-a-drop-down-list

    }
}