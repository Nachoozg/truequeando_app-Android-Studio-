package com.example.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_test);

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
    }
}
