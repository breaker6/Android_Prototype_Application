package com.fbeltran.prototipo_aplicacion_completa;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Login extends AppCompatActivity {
    //Declaramos las variables donde introduciremos el email y el password
    EditText emailEditText;
    EditText passwordEditText;
    //Declaramos el intent que nos permitirá lanzar la pantalla principal si el login es correcto
    Intent intentMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Cogemos las variables del layout usando su id
        emailEditText = (EditText) findViewById(R.id.emailAddress);
        passwordEditText = (EditText) findViewById(R.id.password);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void DoLogin(View view) {
        //Intent i = new Intent(Login.this, MainActivity.class);
        //Convertimos las variables de login en strings para poder compararlas
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (email.equals("admin")){
            //El login es correcto
            if (password.equals("1234")) {
                Toast.makeText(this, "Login Correcto", Toast.LENGTH_SHORT).show();
                //Iniciamos el intent que lanzará el MainActivity
                intentMainActivity = new Intent(this, MainActivity.class);
                //Con el metodo startActivity lo ejecutaremos
                startActivity(intentMainActivity);

            }
            else{
                Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, "Email incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}