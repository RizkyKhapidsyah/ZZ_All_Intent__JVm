package com.rk.ai.b_KirimDataKeActivityLain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rk.ai.R;

public class Activity_1 extends AppCompatActivity {

    Button B_1_MasukkanDataKeActivityLain_IDJAVA;
    EditText ET_1_KirimDataKeActivityLain_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_kirimdatakeactivitylain);

        B_1_MasukkanDataKeActivityLain_IDJAVA = findViewById(R.id.B_1_MasukkanDataKeActivityLain_IDXML);
        ET_1_KirimDataKeActivityLain_IDJAVA = findViewById(R.id.ET_1_KirimDataKeActivityLain_IDXML);

    }

    public void B_1_MasukkanDataKeActivityLain_KetikaDipijit(View Tampil) {
        String Nama = ET_1_KirimDataKeActivityLain_IDJAVA.getText().toString();

        if (Nama.length() == 0) {
            ET_1_KirimDataKeActivityLain_IDJAVA.setError("Anda Kamu Harus Memasukkan Nama Anda!");
        } else {
            Intent i = new Intent(Activity_1.this, Activity_2.class);
            i.putExtra("Nama", Nama);
            startActivity(i);
        }
    }
}
