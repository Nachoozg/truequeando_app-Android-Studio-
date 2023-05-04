package com.example.prueba1;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import androidx.appcompat.app.AppCompatActivity;

public class EleccionMetodoCompraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eleccion_metodo_compra);

        Button IndiceCerrarSesion = findViewById(R.id.guardarMetodoCompra);
        IndiceCerrarSesion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EleccionMetodoCompraActivity.this, PagoOnlineActivity.class);
                startActivity(intent);
            }
        });
    }
}
