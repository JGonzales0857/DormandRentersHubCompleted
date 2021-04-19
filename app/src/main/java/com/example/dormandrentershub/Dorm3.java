package com.example.dormandrentershub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dorm3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dorm3);

        Button btnMessage3 = findViewById(R.id.btnMessage3);
        btnMessage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Dorm3.this,Messaging.class);
                startActivity(int1);
            }
        });
    }
}