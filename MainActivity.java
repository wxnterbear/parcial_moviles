package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button agregar = findViewById(R.id.bagregar);


        agregar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ma2.class);
                startActivity(intent);
            }
        });

        Button conocer = findViewById(R.id.bconocer);

        conocer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView e0 = findViewById(R.id.nombree);
                TextView e1 = findViewById(R.id.edad);
                TextView e2 = findViewById(R.id.carrera);
                TextView e3 = findViewById(R.id.estado);

                String nombre = e0.getText().toString();
                String edad = e1.getText().toString();
                String carrera = e2.getText().toString();
                String estado = e3.getText().toString();

                Intent intent2 = new Intent(MainActivity.this, ma3.class);

                intent2.putExtra("nombre", nombre);
                intent2.putExtra("edad", edad);
                intent2.putExtra("carrera", carrera);
                intent2.putExtra("estado", estado);

                startActivity(intent2);
            }
        });
    }
}
