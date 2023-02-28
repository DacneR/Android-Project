package com.prueba.otraprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "Depuracion";
    EditText sideOne,sideTwo;
    TextView result;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy en Oncreate");

        /*inicializamos variables reconociendo los id de sus objetos*/
        sideOne = findViewById(R.id.ladoUno);
        sideTwo = findViewById(R.id.ladoDos);
        result = findViewById(R.id.resultado);
        calculate = findViewById(R.id.calcular);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entrè a OnStar");

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                //obtengo los valores de esos objetos y almaceno en variables float
                float lado1 = Float.parseFloat(sideOne.getText().toString());
                float lado2 = Float.parseFloat(sideTwo.getText().toString());

                //se hace el calculo para imprimir resultado en el textView
                float resultado = lado1*lado2;
                result.setText(String.valueOf(resultado));*/
                enviarDatos(view);

            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entrè a OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entrè a OnResumen");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entrè a OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entrè a OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entrè a OnDestrory");
    }

    /*
    //envío un parámetro mediante una función
    public void gotAct(View view){
        String correo = "clasegamil.com";

        //selecciono y creo la segunda pantalla que recibe
        Intent pasarDato = new Intent(this,segundaPantalla.class);

        //uso el intent para almacenar el dato
        pasarDato.putExtra("email",correo);

        //ejecuto el intent
        startActivity(pasarDato);
    }*/


    public void enviarDatos(View view){
        float l1 = Float.parseFloat(sideOne.getText().toString());
        float l2 = Float.parseFloat(sideTwo.getText().toString());
        float resultado = l1*l2;

        Intent pasarDato = new Intent(this,segundaPantalla.class);

        pasarDato.putExtra("lado1",l1);
        pasarDato.putExtra("lado2",l2);
        pasarDato.putExtra("resultado",resultado);

        startActivity(pasarDato);


    }




}