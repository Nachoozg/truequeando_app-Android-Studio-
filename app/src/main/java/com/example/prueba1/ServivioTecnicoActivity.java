package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ServivioTecnicoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servicio_tecnico);

        ImageView Atras = findViewById(R.id.flechaatrasserviciotecnico);
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServivioTecnicoActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });

        Button AbrirChat = findViewById(R.id.botonabrirchat);
        AbrirChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServivioTecnicoActivity.this, ChatServicioTecnicoActivity.class);
                startActivity(intent);
            }
        });

    }
}
