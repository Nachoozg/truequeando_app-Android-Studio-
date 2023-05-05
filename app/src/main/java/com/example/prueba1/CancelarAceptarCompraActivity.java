package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CancelarAceptarCompraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cancelaraceptarcompra);

        TextView Aceptar = findViewById(R.id.aceptar);
        Aceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CancelarAceptarCompraActivity.this, CompraAceptadaActivity.class);
                startActivity(intent);
            }
        });

        TextView Rechazar = findViewById(R.id.rechazar);
        Rechazar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CancelarAceptarCompraActivity.this, PagoOnlineActivity.class);
                startActivity(intent);
            }
        });
    }
}
