package com.rk.ai.c_MulaiActivityUntukIntentHasil;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rk.ai.R;

public class Activity_1 extends AppCompatActivity {

    Button B_1_MulaiActivityUntukIntentHasil_IDJAVA;
    TextView TV_1_MulaiActivityUntukIntentHasil_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_mulaiactivityuntukintenthasil);

        B_1_MulaiActivityUntukIntentHasil_IDJAVA = findViewById(R.id.B_1_MulaiActivityUntukIntentHasil_IDXML);
        TV_1_MulaiActivityUntukIntentHasil_IDJAVA = findViewById(R.id.TV_1_MulaiActivityUntukIntentHasil_IDXML);

    }

    public void B_1_MulaiActivityUntukIntentHasil_KetikaDipijit(View Tampil) {
        Intent i = new Intent(Activity_1.this, Activity_2.class);
        startActivityForResult(i, 5);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 5) {
            if (resultCode == Activity.RESULT_OK) {
                TV_1_MulaiActivityUntukIntentHasil_IDJAVA.setText("Haiii " + data.getStringExtra("Hasil"));
            }

            if (resultCode == Activity.RESULT_CANCELED) {
                /* Sementara Kosong Dulu */
            }

        }
    }

}
