package com.fbeltran.prototipo_aplicacion_completa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CalculadoraActivity extends AppCompatActivity {
    //Declaramos las variables donde guardaremos los números introducidos
    EditText primerNumero;
    EditText segundoNumero;
    //Declaramos la variable que usaremos para rellenar el cuadro del resultado
    EditText resultadoEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    public void SumaNumeros(View view) {
        //Cogemos los valores de ambos números escritos por pantalla
        primerNumero = (EditText) findViewById(R.id.primerNumero);
        segundoNumero = (EditText) findViewById(R.id.segundoNumero);
        //Verificamos si se ha dejado algún campo vacio. Si es así, saltará un error y parará la ejecución
        if((primerNumero.getText().toString().isEmpty()) || (segundoNumero.getText().toString().isEmpty())){
            Toast.makeText(this, "Debe rellenar ambos campos", Toast.LENGTH_SHORT).show();
            return;
        }
        //Convertimos ambos números a enteros. Es necesario para operar con ellos
        int numero1 = Integer.parseInt(primerNumero.getText().toString());
        int numero2 = Integer.parseInt(segundoNumero.getText().toString());
        //Sumamos ambos números
        int resul = numero1 + numero2;
        //Asignamos a la variable resultadoEditText el editText donde va el resultado
        resultadoEditText = findViewById(R.id.resultado);
        //Imprimimos el resultado. NOTA: Es necesario convertir el valor entero a string para poder
        //imprimirlo. Lo hacemos con la operacion String.valueOf(resul)
        resultadoEditText.setText(String.valueOf(resul));
    }

    public void RestaNumeros(View view) {
        //Cogemos los valores de ambos números escritos por pantalla
        primerNumero = (EditText) findViewById(R.id.primerNumero);
        segundoNumero = (EditText) findViewById(R.id.segundoNumero);
        //Verificamos si se ha dejado algún campo vacio. Si es así, saltará un error y parará la ejecución
        if((primerNumero.getText().toString().isEmpty()) || (segundoNumero.getText().toString().isEmpty())){
            Toast.makeText(this, "Debe rellenar ambos campos", Toast.LENGTH_SHORT).show();
            return;
        }
        //Convertimos ambos números a enteros. Es necesario para operar con ellos
        int numero1 = Integer.parseInt(primerNumero.getText().toString());
        int numero2 = Integer.parseInt(segundoNumero.getText().toString());
        //Restamos ambos números
        int resul = numero1 - numero2;
        //Asignamos a la variable resultadoEditText el editText donde va el resultado
        resultadoEditText = findViewById(R.id.resultado);
        //Imprimimos el resultado. NOTA: Es necesario convertir el valor entero a string para poder
        //imprimirlo. Lo hacemos con la operacion String.valueOf(resul)
        resultadoEditText.setText(String.valueOf(resul));
    }

    public void MultiplicaNumeros(View view) {
        //Cogemos los valores de ambos números escritos por pantalla
        primerNumero = (EditText) findViewById(R.id.primerNumero);
        segundoNumero = (EditText) findViewById(R.id.segundoNumero);
        //Verificamos si se ha dejado algún campo vacio. Si es así, saltará un error y parará la ejecución
        if((primerNumero.getText().toString().isEmpty()) || (segundoNumero.getText().toString().isEmpty())){
            Toast.makeText(this, "Debe rellenar ambos campos", Toast.LENGTH_SHORT).show();
            return;
        }
        //Convertimos ambos números a long (entero largo). Es necesario para operar con ellos
        long numero1 = Long.parseLong(primerNumero.getText().toString());
        long numero2 = Long.parseLong(segundoNumero.getText().toString());
        //Multiplicamos ambos números
        long resul = numero1 * numero2;
        //Asignamos a la variable resultadoEditText el editText donde va el resultado
        resultadoEditText = findViewById(R.id.resultado);
        //Imprimimos el resultado. NOTA: Es necesario convertir el valor entero a string para poder
        //imprimirlo. Lo hacemos con la operacion String.valueOf(resul)
        resultadoEditText.setText(String.valueOf(resul));
    }

    public void DivideNumeros(View view) {
        //Cogemos los valores de ambos números escritos por pantalla
        primerNumero = (EditText) findViewById(R.id.primerNumero);
        segundoNumero = (EditText) findViewById(R.id.segundoNumero);
        //Verificamos si se ha dejado algún campo vacio. Si es así, saltará un error y parará la ejecución
        if((primerNumero.getText().toString().isEmpty()) || (segundoNumero.getText().toString().isEmpty())){
            Toast.makeText(this, "Debe rellenar ambos campos", Toast.LENGTH_SHORT).show();
            return;
        }
        //Convertimos ambos números a double (float largo). Es necesario para operar con ellos
        double numero1 = Double.parseDouble(primerNumero.getText().toString());
        double numero2 = Double.parseDouble(segundoNumero.getText().toString());
        //Dividimos ambos números
        double resul = numero1 / numero2;
        //Asignamos a la variable resultadoEditText el editText donde va el resultado
        resultadoEditText = findViewById(R.id.resultado);
        //Imprimimos el resultado. NOTA: Es necesario convertir el valor entero a string para poder
        //imprimirlo. Lo hacemos con la operacion String.valueOf(resul)
        resultadoEditText.setText(String.valueOf(resul));
    }
}