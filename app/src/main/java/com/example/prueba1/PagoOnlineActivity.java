package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PagoOnlineActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagonline);

        ImageView flecha = findViewById(R.id.flechilla);
        flecha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PagoOnlineActivity.this, EleccionMetodoCompraActivity.class);
                startActivity(intent);
            }
        });

        Button pasar = findViewById(R.id.button2);
        pasar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PagoOnlineActivity.this, CancelarAceptarCompraActivity.class);
                startActivity(intent);
            }
        });
    }
}
