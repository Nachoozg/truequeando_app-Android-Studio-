package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class IngresarDatosBancariosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingreso_datos_bancarios);

        ImageButton  volverAtrasIngresoDatosBancarios = findViewById(R.id.salir_ingreso_datos_bancarios);

        volverAtrasIngresoDatosBancarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IngresarDatosBancariosActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        Button guardarDatosBancarios = findViewById(R.id.guardar_datos_bancarios);

        guardarDatosBancarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IngresarDatosBancariosActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
