package com.example.segundo_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.TextView;

public class grind extends AppCompatActivity {

    private Button bsumar;
    private Button brestar;

    private TextView tresultado;

    private EditText Vnumero1;
    private EditText Vnumero2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grind);
        bsumar= findViewById(R.id.bsuma);
        bsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tresultado.setText( Suma(Integer.parseInt(Vnumero1.getText().toString())
                , Integer.parseInt(Vnumero2.getText().toString()) )+"");

            }
        });

        brestar= findViewById(R.id.brestar);
        brestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tresultado.setText( Restar(Integer.parseInt(Vnumero1.getText().toString())
                        , Integer.parseInt(Vnumero2.getText().toString()) )+"");
            }
        });
        tresultado=findViewById(R.id.Vresultado);
        Vnumero1=findViewById(R.id.Etnumero1);
        Vnumero2=findViewById(R.id.Etnumero2);


    }

    public int Suma (int a, int b){
        return a+b;
    }
    public int Restar (int a, int b) {
        return a - b;
    }

}