package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ma3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma3);

        Intent intent2 = getIntent();

        String nombre = intent2.getStringExtra("nombre");
        String edad = intent2.getStringExtra("edad");
        String carrera = intent2.getStringExtra("carrera");
        String estado = intent2.getStringExtra("estado");

        TextView edade = findViewById(R.id.edade);
        TextView nombree = findViewById(R.id.nombre);
        TextView carrerae = findViewById(R.id.carrarae);
        TextView estadoe = findViewById(R.id.estadoe);

        edade.setText(""+ edad);
        nombree.setText("" + nombre);
        carrerae.setText("" + carrera);
        estadoe.setText("" + estado);

        Button agregar2 = findViewById(R.id.badd);

        agregar2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ma3.this, ma2.class);
                startActivity(intent);
            }
        });

        Button volver2 = findViewById(R.id.volvere);

        volver2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ma3.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}