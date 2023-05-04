package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        TextView Mensaje = findViewById(R.id.titulo);
        Mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, MensajesActivity.class);
                startActivity(intent);
            }
        });

        TextView MensajeVP = findViewById(R.id.mensajeVP);
        MensajeVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, MensajesActivity.class);
                startActivity(intent);
            }
        });

        ImageView MGris = findViewById(R.id.perfil);
        MGris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, MensajesActivity.class);
                startActivity(intent);
            }
        });

        ImageView guardados = findViewById(R.id.guardados);
        guardados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, GuardadosActivity.class);
                startActivity(intent);
            }
        });

        ImageView home = findViewById(R.id.home1);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
