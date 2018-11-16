package com.example.usuario.practica2movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button botonLogin, botonRegistrar, botonBuscar,botonParametro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    botonLogin = (Button) findViewById(R.id.btnLogin);
    botonRegistrar = (Button) findViewById(R.id.btn2);
    botonBuscar = (Button) findViewById(R.id.btn3);
    botonParametro = (Button) findViewById(R.id.btnparametro);

        botonParametro.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActividadPasarParametro.class);
                startActivity(intent);
            }
        });

        botonLogin.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Se genera la navegabilidad entre la actividad principal y la actividad de Login
                Intent intent = new Intent(MainActivity.this, ActividadLogin.class);
                startActivity(intent);
            }
        });
            }
        }
