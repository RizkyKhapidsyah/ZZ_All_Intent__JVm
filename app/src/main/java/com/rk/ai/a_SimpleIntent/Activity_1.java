package com.rk.ai.a_SimpleIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rk.ai.MainActivity;
import com.rk.ai.R;

public class Activity_1 extends AppCompatActivity {

    Button B_1_SimpleIntent_IDJAVA, B_Kembali_SimpleIntent_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_simpleintent);

        B_1_SimpleIntent_IDJAVA = findViewById(R.id.B_1_SimpleIntent_IDXML);
        B_Kembali_SimpleIntent_IDJAVA = findViewById(R.id.B_Kembali_SimpleIntent_IDXML);

        B_Kembali_SimpleIntent_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Kembali = new Intent(Activity_1.this, MainActivity.class);
                startActivity(Kembali);
            }
        });

    }

    public void B_1_SimpleIntent_Ketika_Dipijit(View Tampil) {
        Intent Contoh_SimpleIntent = new Intent(Activity_1.this, Activity_2.class);
        startActivity(Contoh_SimpleIntent);
    }


}
