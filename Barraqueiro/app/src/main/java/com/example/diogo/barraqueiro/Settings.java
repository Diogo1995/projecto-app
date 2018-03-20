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

        Switch unitsSwitch = (Switch) findViewById(R.id.unitsSwitch);
        Boolean unitsSwitchState = unitsSwitch.isChecked();
        if (unitsSwitchState) unitsSwitch.setText("@string/USCUnits"); // displayed text of the Switch whenever it is in checked or on state
        else unitsSwitch.setText("@string/SIBUnits"); // displayed text of the Switch whenever it is in unchecked i.e. off state

        //TODO gravar posição da switch escolhida!!
    }
}