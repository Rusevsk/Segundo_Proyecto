package com.example.segundo_proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    private TextView VNombre;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        VNombre =(TextView) findViewById(R.id.VNombre);
        String Nombre = getIntent().getStringExtra("Nombre");
        VNombre.setText("Bienvenido " + Nombre);

        spinner= findViewById(R.id.Lista);

        ArrayList<Nombres> nombres = new ArrayList<>();
        nombres.add(new Nombres(1,"Andres","Vargas"));
        nombres.add(new Nombres(2,"Andrea","Vargas"));

        ArrayAdapter<Nombres> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,nombres);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Menu.this,"Realize una seleccion" ,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }



    public void Frame (View view) {
        Intent frame = new Intent(this, Frame.class);
        startActivity(frame);
    }

    public void Constraint (View view) {
        Intent constraint = new Intent(this, Constraint.class);
        startActivity(constraint);
    }

    public void grind (View view) {
        Intent grind = new Intent(this, grind.class);
        startActivity(grind);
    }

    public void Relative (View view) {
        Intent Relative = new Intent(this, Relative.class);
        startActivity(Relative);
    }
}