package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SubirAnuncioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subiranuncio);

        ImageView Atras = findViewById(R.id.flechaatrasproducto);
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubirAnuncioActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        Button Guardar = findViewById(R.id.botonguardaranuncio);
        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubirAnuncioActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
