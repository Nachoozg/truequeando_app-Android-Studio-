package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

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

    }
}
