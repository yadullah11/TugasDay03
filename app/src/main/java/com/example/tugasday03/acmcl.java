package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class acmcl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acmcl);

        Button buyButton = findViewById(R.id.btnbuyacmcl);
        Button shareButton = findViewById(R.id.btnshareacmcl);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buyUrl = "https://alexandrechristie.com/men-collection?product_id=1947";

                Intent buyIntent = new Intent(Intent.ACTION_VIEW);
                buyIntent.setData(Uri.parse(buyUrl));
                startActivity(buyIntent);
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productUrl = "https://alexandrechristie.com/men-collection?product_id=1947";

                String shareMessage = "Temukan Alexandre Christie 6609 MCL Jam tangan seharga Rp1.300.000. Dapatkan sekarang lewat LUXURY WATCH!\n" + productUrl;

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}
