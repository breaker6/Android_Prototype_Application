package com.fbeltran.prototipo_aplicacion_completa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Declaramos la variable intent con la que lanzaremos la aplicación elegida
    Intent activityElegido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalculadoraLauncher(View view) {
        //Iniciamos el intent que lanzará el CalculadoraActivity
        activityElegido = new Intent(this, CalculadoraActivity.class);
        //Con el metodo startActivity lo ejecutaremos
        startActivity(activityElegido);
    }

    public void MapsLauncher(View view) {
        //Iniciamos el intent que lanzará el MapsActivity
        activityElegido = new Intent(this, MapsActivity.class);
        //Con el metodo startActivity lo ejecutaremos
        startActivity(activityElegido);
    }
}