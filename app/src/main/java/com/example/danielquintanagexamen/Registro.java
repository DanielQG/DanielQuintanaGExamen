package com.example.danielquintanagexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    Bundle usuarioRegistro;
    TextView txtUsuarioRegistro,txtCalculoCuota;
    EditText etNombreRegistro, etMontoRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtUsuarioRegistro = findViewById(R.id.txtRegistro1);
        txtCalculoCuota = findViewById(R.id.txtRegistro2);
        etNombreRegistro = findViewById(R.id.etRegistro1);
        etMontoRegistro = findViewById(R.id.etRegistro2);

        usuarioRegistro = getIntent().getExtras();
        String usuario= usuarioRegistro.getString("datoLogin1");
        txtUsuarioRegistro.setText(usuario);
    }

    public void Calcular(View v){

        double cuotaIncial = Double.parseDouble(etMontoRegistro.getText().toString());
        double costoCurso = 1800;
        double interes = 1800*0.05;
        double cuotaMensual = ((1800-cuotaIncial)/3)+interes;
        txtCalculoCuota.setText(Double.toString(cuotaMensual));
    }

    public void Guardar(View v){

        Intent intentRegistro = new Intent(Registro.this,Encuesta.class);
        intentRegistro.putExtra("datoRegistro1","Cuota mensual: " +txtCalculoCuota.getText().toString());
        intentRegistro.putExtra("datoRegistro2","Persona registrada: " +etNombreRegistro.getText().toString());
        intentRegistro.putExtra("datoRegistro3",txtUsuarioRegistro.getText().toString());
        startActivity(intentRegistro);

        Toast.makeText(getApplicationContext(),"Elemento guardado con exito", Toast.LENGTH_SHORT).show();
    }
}
