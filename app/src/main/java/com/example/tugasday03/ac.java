package com.example.tugasday03;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac);

        ImageButton acmdbButton = findViewById(R.id.btnacmdb);
        ImageButton acmdrButton = findViewById(R.id.btnacmdr);
        ImageButton acmcbButton = findViewById(R.id.btnacmcb);
        ImageButton acmclButton = findViewById(R.id.btnacmcl);
        ImageButton acmhrButton = findViewById(R.id.btnacmhr);

        acmdbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ac.this, acmdb.class);
                startActivity(intent);
            }
        });

        acmdrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ac.this, acmdr.class);
                startActivity(intent);
            }
        });

        acmcbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ac.this, acmcb.class);
                startActivity(intent);
            }
        });

        acmclButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ac.this, acmcl.class);
                startActivity(intent);
            }
        });

        acmhrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ac.this, acmhr.class);
                startActivity(intent);
            }
        });
    }
}
