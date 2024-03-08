package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class hublot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hublot);

        ImageButton energyButton = findViewById(R.id.btnenergy);
        ImageButton flowerButton = findViewById(R.id.btnflower);
        ImageButton fullCarbonButton = findViewById(R.id.btnfullcarbon);
        ImageButton rainbowButton = findViewById(R.id.btnrainbow);
        ImageButton titaniumButton = findViewById(R.id.btntitanium);

        energyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(hublot.this, hublotenergy.class);
                startActivity(intent);
            }
        });

        flowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hublot.this, hublotflower.class);
                startActivity(intent);
            }
        });

        fullCarbonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hublot.this, hublotfullcarbon.class);
                startActivity(intent);
            }
        });

        rainbowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hublot.this, hublotrainbow.class);
                startActivity(intent);
            }
        });

        titaniumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hublot.this, hublottitanium.class);
                startActivity(intent);
            }
        });
    }
}
