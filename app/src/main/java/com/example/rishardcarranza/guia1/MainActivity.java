package com.example.rishardcarranza.guia1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declarar variables
    private Button btnCounter;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar objetos
        btnCounter = (Button) findViewById(R.id.btnCounter);

        // Adjuntar eventos
        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCounter.setText(Integer.toString(counter++));
            }
        });
    }
}
