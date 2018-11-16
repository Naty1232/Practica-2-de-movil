package com.example.usuario.practica2movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActividadPasarParametro extends AppCompatActivity {

    EditText cajaDatos;
    Button botonEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_pasar_parametro);
        cajaDatos = (EditText) findViewById(R.id.txtparametro);
        botonEnviar = (Button) findViewById(R.id.btnEnviarParametro);
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadPasarParametro.this, RecibirParametro.class);

                Bundle bundle = new Bundle();

                bundle.putString("dato", cajaDatos.getText().toString());

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}

