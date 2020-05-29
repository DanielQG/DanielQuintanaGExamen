package com.example.danielquintanagexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    EditText usuario, contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = findViewById(R.id.etLogin1);
        contrasena = findViewById(R.id.etLogin2);

        //usuario

    }

    public void IniciarSesion(View v){
        String usuarioL = "estudiante2020", contrasenaL= "uisrael2020";

        if (usuario.getText().toString().equals(usuarioL) && contrasena.getText().toString().equals(contrasenaL)){
        Intent intentLogin = new Intent(Login.this,Registro.class);
        intentLogin.putExtra("datoLogin1","Bienvenido: "+usuario.getText().toString());
        startActivity(intentLogin);

         }else{
            Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show();
        }

    }

}
