package com.rk.ai.b_KirimDataKeActivityLain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rk.ai.R;

public class Activity_2 extends AppCompatActivity {

    Button B_2_MasukkanDataKeActivityLain_IDJAVA;
    TextView TV_1_KirimDataKeActivityLain_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_kirimdatakeactivitylain);

        B_2_MasukkanDataKeActivityLain_IDJAVA = findViewById(R.id.B_2_MasukkanDataKeActivityLain_IDXML);
        TV_1_KirimDataKeActivityLain_IDJAVA = findViewById(R.id.TV_1_KirimDataKeActivityLain_IDXML);

        String Nama = getIntent().getStringExtra("Nama");
        TV_1_KirimDataKeActivityLain_IDJAVA.setText("Hai, Apa Kabar " + Nama);

    }

    public void B_2_MasukkanDataKeActivityLain_KetikaDipijit(View Tampil) {
        Intent i = new Intent(Activity_2.this, Activity_1.class);
        startActivity(i);
    }

}
