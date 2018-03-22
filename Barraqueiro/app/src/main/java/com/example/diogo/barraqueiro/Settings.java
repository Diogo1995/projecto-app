package com.example.diogo.barraqueiro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;

public class Settings extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Ver o estado da switch
        Switch darkModeSwitch = (Switch) findViewById(R.id.darkModeSwitch);
        if(darkModeSwitch.isChecked()){
            // TODO alterar cores
        }

        Spinner languages = findViewById(R.id.languageDropDown);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.language_entries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        languages.setAdapter(adapter);
        languages.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // TODO idioma escolhido
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // TODO mostrar idioma default (está a mostrar o o primeiro idioma da lista agora)
    }

    public void distanceRadioButtonClicked(View v){
        boolean checked = ((RadioButton) v).isChecked();
        switch(v.getId()) {
            case R.id.kmButton:
                if (checked)
                    // TODO distância em km
                break;
            case R.id.mileButton:
                if (checked)
                    // TODO distância em milhas
                break;
        }
    }

    public void volumeRadioButtonClicked(View v){
        boolean checked = ((RadioButton) v).isChecked();
        switch(v.getId()) {
            case R.id.lButton:
                if (checked)
                    // TODO volume em litros
                    break;
            case R.id.galButton:
                if (checked)
                    // TODO volume em gallons
                    break;
        }
    }
}