package com.example.segundo_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class Constraint extends AppCompatActivity {

    private CheckBox Cam, Caz;
    private ImageView Vam, Vaz, Vve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        Cam = (CheckBox) findViewById(R.id.Camarillo);
        Caz = (CheckBox) findViewById(R.id.Cazul);
        Vam = (ImageView) findViewById(R.id.Vamarillo);
        Vaz = (ImageView) findViewById(R.id.Vazul);
        Vve = (ImageView) findViewById(R.id.Vver);


    }
    public void MostrarAm (View view){
        if (Cam.isChecked()){
            Vam.setVisibility(View.VISIBLE);
        }
        else{
            Vam.setVisibility(View.INVISIBLE);
        }
        if (Caz.isChecked()) {
            Vaz.setVisibility(View.VISIBLE);
        }else{
            Vaz.setVisibility(View.INVISIBLE);
        }

        if (Caz.isChecked() && Cam.isChecked()){
            Vve.setVisibility(View.VISIBLE);
            Vam.setVisibility(View.INVISIBLE);
            Vaz.setVisibility(View.INVISIBLE);
        }
        else{
            Vve.setVisibility(View.INVISIBLE);
        }
    }

}