package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class rolex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolex);

        ImageButton daytonaButton = findViewById(R.id.btndaytona);
        ImageButton deepseaButton = findViewById(R.id.btndeepsea);
        ImageButton hulkButton = findViewById(R.id.btnhulk);
        ImageButton pepsiButton = findViewById(R.id.btnpepsi);
        ImageButton premiumButton = findViewById(R.id.btnpremium);

        daytonaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rolex.this, rolexdaytona.class);
                startActivity(intent);
            }
        });

        deepseaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rolex.this, rolexdeepsea.class);
                startActivity(intent);
            }
        });

        hulkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rolex.this, rolexhulk.class);
                startActivity(intent);
            }
        });

        pepsiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rolex.this, rolexpepsi.class);
                startActivity(intent);
            }
        });

        premiumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rolex.this, rolexpremium.class);
                startActivity(intent);
            }
        });
    }
}
