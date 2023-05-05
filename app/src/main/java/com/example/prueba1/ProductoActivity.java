package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);

        Button Comprar = findViewById(R.id.botonguardar);
        Comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, EleccionMetodoCompraActivity.class);
                startActivity(intent);
            }
        });

        ImageView Chat123 = findViewById(R.id.chatMensaje12);
        Chat123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, ChatDesdeProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Atras = findViewById(R.id.flechaatrasproduct);
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductoActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
