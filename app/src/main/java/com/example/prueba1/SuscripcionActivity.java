package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SuscripcionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suscripcion);

        ImageView Atras = findViewById(R.id.imageView5);
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuscripcionActivity.this, ModificarPerfilActivity.class);
                startActivity(intent);
            }
        });

        Button Pagar = findViewById(R.id.button);
        Pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuscripcionActivity.this, PagoSuscripActivity.class);
                startActivity(intent);
            }
        });
    }
}
