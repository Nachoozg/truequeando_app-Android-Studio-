package com.example.prueba1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Maneja los clics en los elementos del menú desplegable
                switch (item.getItemId()) {
                    case R.id.nav_settings:
                        // Abre la actividad de ajustes
                        break;
                    case R.id.nav_subscribers:
                        // Abre la actividad para unirse a suscriptores
                        break;
                    case R.id.nav_technical_service:
                        // Abre la actividad de servicio técnico
                        break;
                    case R.id.administrator_functions:
                        // Abre la actividad de funciones administrador
                        break;
                    case R.id.payment_method:
                        // Abre la actividad de método de pago
                        break;
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

        ImageButton closeDrawerButton = navigationView.getHeaderView(0).findViewById(R.id.close_drawer_button);
        closeDrawerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cierra el menú desplegable cuando se hace clic en el botón para cerrar
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        });
    }
}
