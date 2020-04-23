package com.rk.ai.c_MulaiActivityUntukIntentHasil;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rk.ai.R;

public class Activity_2 extends AppCompatActivity {

    Button B_2_MulaiActivityUntukIntentHasil_IDJAVA;
    EditText ET_1_MulaiActivityUntukIntentHasil_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_mulaiactivityuntukintenthasil);

        B_2_MulaiActivityUntukIntentHasil_IDJAVA = findViewById(R.id.B_2_MulaiActivityUntukIntentHasil_IDXML);
        ET_1_MulaiActivityUntukIntentHasil_IDJAVA = findViewById(R.id.ET_1_MulaiActivityUntukIntentHasil_IDXML);

    }

    public void B_2_MulaiActivityUntukIntentHasil_KetikaDipijit(View Tampil) {
        String Nama = ET_1_MulaiActivityUntukIntentHasil_IDJAVA.getText().toString();

        if (Nama.length() == 0) {
            ET_1_MulaiActivityUntukIntentHasil_IDJAVA.setError("Anda Harus Memasukkan Nama!");
        } else {
            Intent i = new Intent();
            i.putExtra("Hasil", Nama);
            setResult(Activity.RESULT_OK, i);
            finish();
        }
    }

}
