package com.example.prueba1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MenuActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Obtener una referencia al DrawerLayout
        drawerLayout = findViewById(R.id.drawer_layout);

        // Crear un Intent para iniciar la actividad HomeActivity
        Intent intent = new Intent(this, HomeActivity.class);

        // Iniciar la actividad HomeActivity
        startActivity(intent);

        // Crear un BroadcastReceiver para recibir mensajes desde la actividad HomeActivity
        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                // Abrir el DrawerLayout
                drawerLayout.openDrawer(GravityCompat.START);
            }
        };

        // Registrar el BroadcastReceiver
        registerReceiver(broadcastReceiver, new IntentFilter("OPEN_DRAWER"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Anular el registro del BroadcastReceiver
        unregisterReceiver(broadcastReceiver);
    }
}
