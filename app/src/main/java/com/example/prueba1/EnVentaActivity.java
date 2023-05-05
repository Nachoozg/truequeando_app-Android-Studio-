package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EnVentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enventa);

        ImageView Articulo = findViewById(R.id.zapatillas1);
        Articulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnVentaActivity.this, ModificarVentaActivity.class);
                startActivity(intent);
            }
        });

        ImageView Atras = findViewById(R.id.imageView5);
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnVentaActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });
    }
}
