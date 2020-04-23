package com.rk.ai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rk.ai.a_SimpleIntent.Activity_1;


public class MainActivity extends AppCompatActivity {

    Button B_1_MainActivity_IDJAVA, B_2_MainActivity_IDJAVA, B_3_MainActivity_IDJAVA;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_1_MainActivity_IDJAVA = findViewById(R.id.B_1_MainActivity_IDXML);
        B_2_MainActivity_IDJAVA = findViewById(R.id.B_2_MainActivity_IDXML);
        B_3_MainActivity_IDJAVA = findViewById(R.id.B_3_MainActivity_IDXML);

        B_1_MainActivity_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this, Activity_1.class);
                startActivity(i);
            }
        });

        B_2_MainActivity_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this, com.rk.ai.b_KirimDataKeActivityLain.Activity_1.class);
                startActivity(i);
            }
        });

        B_3_MainActivity_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this, com.rk.ai.c_MulaiActivityUntukIntentHasil.Activity_1.class);
                startActivity(i);
            }
        });

    }
}
