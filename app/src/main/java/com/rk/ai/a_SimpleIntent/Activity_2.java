package com.rk.ai.a_SimpleIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rk.ai.R;

public class Activity_2 extends AppCompatActivity {

    Button B_2_SimpleIntent_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_simpleintent);

        B_2_SimpleIntent_IDJAVA = findViewById(R.id.B_2_SimpleIntent_IDXML);

    }

    public void B_2_SimpleIntent_Ketika_Dipijit(View Tampil) {
        Intent Kembali = new Intent(Activity_2.this, Activity_1.class);
        startActivity(Kembali);
    }
}
