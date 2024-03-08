package com.example.tugasday03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton btnHublot, btnAC, btnRolex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHublot = findViewById(R.id.btnhublot);
        btnAC = findViewById(R.id.btnac);
        btnRolex = findViewById(R.id.btnrolex);

        btnHublot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hublot.class);
                startActivity(intent);
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ac.class);
                startActivity(intent);
            }
        });

        btnRolex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, rolex.class);
                startActivity(intent);
            }
        });
    }
}




