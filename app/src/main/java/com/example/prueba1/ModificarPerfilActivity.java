package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ModificarPerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);

        ImageView Atras = findViewById(R.id.imageView5);
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModificarPerfilActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });

        Button Guardar = findViewById(R.id.button5);
        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModificarPerfilActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });

        Button Premium = findViewById(R.id.button4);
        Premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModificarPerfilActivity.this, SuscripcionActivity.class);
                startActivity(intent);
            }
        });

        ImageButton Premium2 = findViewById(R.id.imageButton15);
        Premium2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModificarPerfilActivity.this, SuscripcionActivity.class);
                startActivity(intent);
            }
        });
    }
}
