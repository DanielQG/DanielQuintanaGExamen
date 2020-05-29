package com.example.danielquintanagexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    TextView txtUsuario, txtNombre, txtMonto,txt1,txt2,txt3;
    Bundle  usuarioR, nombreR, montoR,e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        txtUsuario = findViewById(R.id.txtResumen1);
        txtNombre = findViewById(R.id.txtResumen2);
        txtMonto = findViewById(R.id.txtResumen3);
        txt1 = findViewById(R.id.txtResumen4);
        txt2 = findViewById(R.id.txtResumen5);
        txt3 = findViewById(R.id.txtResumen6);

        usuarioR = getIntent().getExtras();
        nombreR = getIntent().getExtras();
        montoR = getIntent().getExtras();
        e1 = getIntent().getExtras();
        e2 = getIntent().getExtras();
        e3 = getIntent().getExtras();

        String rResumen1 =usuarioR.getString("datoEncuesta4");
        String rResumen2 =nombreR.getString("datoEncuesta5");
        String rResumen3 =montoR.getString("datoEncuesta6");
        String rResumen4 =e1.getString("datoEncuesta1");
        String rResumen5 =e2.getString("datoEncuesta2");
        String rResumen6 =e3.getString("datoEncuesta3");

        txtUsuario.setText(rResumen1);
        txtNombre.setText(rResumen2);
        txtMonto.setText(rResumen3);
        txt1.setText(rResumen4);
        txt2.setText(rResumen5);
        txt3.setText(rResumen6);



    }
}
