package com.example.dormandrentershub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dorm1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dorm1);

        Button btnMessage1 = findViewById(R.id.btnMessage1);
        btnMessage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Dorm1.this,Messaging.class);
                startActivity(int1);
            }
        });
    }
}