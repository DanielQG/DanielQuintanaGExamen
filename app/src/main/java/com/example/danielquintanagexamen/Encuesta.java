package com.example.danielquintanagexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {

    Bundle usuarioEncuesta,nombreEncuesta,cuotaEncuesta;
    EditText r1;
    CheckBox r2,r3,r4;
    RadioButton r5,r6;
    TextView usuarioL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        r1= findViewById(R.id.etEncuesta1);
        r2 = findViewById(R.id.cbEncuesta1);
        r3 = findViewById(R.id.cbEncuesta2);
        r4 = findViewById(R.id.cbEncuesta3);
        r5 = findViewById(R.id.rbEncuesta1);
        r6 = findViewById(R.id.rbEncuesta2);
        usuarioL = findViewById(R.id.txtEncuesta1);

        usuarioEncuesta = getIntent().getExtras();
        nombreEncuesta = getIntent().getExtras();
        cuotaEncuesta = getIntent().getExtras();

        String usuarioE =usuarioEncuesta.getString("datoRegistro3");
        String nombreE =nombreEncuesta.getString("datoRegistro2");
        String cuotaE =cuotaEncuesta.getString("datoRegistro1");

        usuarioL.setText(usuarioE);

    }

    public void Enviar(View v){

        String resultado1;
        String resultado2;
        String resultado3;


        resultado1 = r1.getText().toString();


        if(r2.isChecked()==true){
            resultado2 = r2.getText().toString();
        }else{
            if(r3.isChecked()==true){
                resultado2 = r3.getText().toString();
            }else{
                resultado2 = r4.getText().toString();
            }
        }
        if(r5.isChecked()==true){
            resultado3 = r5.getText().toString();
        }else{
            resultado3 = r6.getText().toString();
        }
        Intent intentEncuesta = new Intent(Encuesta.this,Resumen.class);
        intentEncuesta.putExtra("datoEncuesta1","Resultado 1: " +resultado1);
        intentEncuesta.putExtra("datoEncuesta2","Resultado 2: " +resultado2);
        intentEncuesta.putExtra("datoEncuesta3","Resultado 3: " +resultado3);
        intentEncuesta.putExtra("datoEncuesta4",usuarioEncuesta.getString("datoRegistro3"));
        intentEncuesta.putExtra("datoEncuesta5",nombreEncuesta.getString("datoRegistro2"));
        intentEncuesta.putExtra("datoEncuesta6",cuotaEncuesta.getString("datoRegistro1"));


        startActivity(intentEncuesta);
    }
}
