package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CancelarAceptarBorradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cancelaraceptarborrado);

        TextView Continuar = findViewById(R.id.aceptar);
        Continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CancelarAceptarBorradoActivity.this, BorradoAceptadoActivity.class);
                startActivity(intent);
            }
        });

        TextView Rechazar = findViewById(R.id.rechazar);
        Rechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CancelarAceptarBorradoActivity.this, ModificarVentaActivity.class);
                startActivity(intent);
            }
        });
    }
}
