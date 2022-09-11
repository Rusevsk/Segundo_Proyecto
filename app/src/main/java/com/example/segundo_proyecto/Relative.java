package com.example.segundo_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Relative extends AppCompatActivity {


    private ImageView imagen;
    private ImageView Fazul;
    private Switch switchVisibility;
    private RadioButton Razul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_relative);
        imagen = findViewById(R.id.Fantasma);
        Fazul = findViewById(R.id.Fazul);
        Razul = findViewById(R.id.Razul);
        switchVisibility = findViewById(R.id.Vswitch);
        switchVisibility.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    imagen.setVisibility(View.VISIBLE);
                }
                else{
                    imagen.setVisibility(View.INVISIBLE);
                    Fazul.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
    public void Cazul (View view){
        if (Razul.isChecked() == true && switchVisibility.isChecked() == true){
            Fazul.setVisibility(View.VISIBLE);
        }
    }

}
