package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_test);

        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawer_layout);

        ImageButton abrirMenu = findViewById(R.id.menu_desplegable);
        abrirMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        ImageView Zapatilla = findViewById(R.id.zapatillas1);
        Zapatilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Iphone = findViewById(R.id.iphone);
        Iphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Zapatillas2 = findViewById(R.id.zapatillas2);
        Zapatillas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Coche = findViewById(R.id.coche1);
        Coche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Gorra = findViewById(R.id.gorra);
        Gorra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Coche2 = findViewById(R.id.coche2);
        Coche2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Coche3 = findViewById(R.id.coche3);
        Coche3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Play = findViewById(R.id.plei);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Portatil = findViewById(R.id.portatil);
        Portatil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProductoActivity.class);
                startActivity(intent);
            }
        });

        ImageView Mas = findViewById(R.id.imageView7);
        Mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SubirAnuncioActivity.class);
                startActivity(intent);
            }
        });

        ImageView Perfil = findViewById(R.id.perro);
        Perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });

        ImageView Guardados = findViewById(R.id.guardados);
        Guardados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, GuardadosActivity.class);
                startActivity(intent);
            }
        });

        ImageView Mensajes = findViewById(R.id.chat1);
        Mensajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()) {
                    case R.id.nav_settings:
                        intent = new Intent(HomeActivity.this, PerfilActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_subscribers:
                        intent = new Intent(HomeActivity.this, SuscripcionActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_technical_service:
                        intent = new Intent(HomeActivity.this, ServivioTecnicoActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.administrator_functions:
                        intent = new Intent(HomeActivity.this, HomeAdminActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.payment_method:
                        intent = new Intent(HomeActivity.this, IngresarDatosBancariosActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_logout:
                        intent = new Intent(HomeActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }
}
