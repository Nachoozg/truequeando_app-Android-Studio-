package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ModificarVentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modificarventa);

        ImageView Flecha = findViewById(R.id.flechaatrasproduct);
        Flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModificarVentaActivity.this, EnVentaActivity.class);
                startActivity(intent);
            }
        });

        Button Eliminar = findViewById(R.id.botoneliminar);
        Eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModificarVentaActivity.this, CancelarAceptarBorradoActivity.class);
                startActivity(intent);
            }
        });

        Button Guardar = findViewById(R.id.botonguardar);
        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModificarVentaActivity.this, CancelarAceptarBorradoActivity.class);
                startActivity(intent);
            }
        });
    }
}
