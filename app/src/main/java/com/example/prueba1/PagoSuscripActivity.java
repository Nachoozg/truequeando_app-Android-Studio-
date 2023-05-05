package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PagoSuscripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagosuscrip);

        ImageView salirCompletarCompra = findViewById(R.id.salir_completar_compra);
        salirCompletarCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PagoSuscripActivity.this, SuscripcionActivity.class);
                startActivity(intent);
            }
        });

        Button Pagar = findViewById(R.id.button2);
        Pagar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PagoSuscripActivity.this, CancelarAceptarCompraActivity.class);
                startActivity(intent);
            }
        });

    }
}
