package com.example.segundo_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Frame extends AppCompatActivity {
    private ImageView Vflappy;
    private Button btnOcultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        Vflappy = (ImageView) findViewById(R.id.Vflappy);
        btnOcultar =(Button) findViewById(R.id.btnOcultar);

    }

    public void Ocultar (View view){
        btnOcultar.setVisibility(View.INVISIBLE);
        Vflappy.setVisibility(View.VISIBLE);
    }


}