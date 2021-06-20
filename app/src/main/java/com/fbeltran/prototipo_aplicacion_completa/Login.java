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
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.emailAddress);
        password = (EditText) findViewById(R.id.password);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void DoLogin(View view) {
        Intent i = new Intent(Login.this, MainActivity.class);

        if (Objects.equals(email, "admin")){
            Toast.makeText(this, "Login Correcto", Toast.LENGTH_SHORT).show();
        }
    }
}