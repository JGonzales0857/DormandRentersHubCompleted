package com.example.dormandrentershub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_choice);

        Button renterBtn = findViewById(R.id.renterBtn);
        Button ownerBtn = findViewById(R.id.ownerBtn);
        renterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(UserChoice.this,MainActivity.class);
                startActivity(int1);
            }
        });
        ownerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(UserChoice.this,OwnerRegistration.class);
                startActivity(int2);
            }
        });
    }
}