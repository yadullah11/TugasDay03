package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class acmcb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acmcb);

        Button buyButton = findViewById(R.id.btnbuyacmcb);
        Button shareButton = findViewById(R.id.btnshareacmcb);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buyUrl = "https://alexandrechristie.com/men-collection?product_id=1955&sort=p.date_added&order=DESC";

                Intent buyIntent = new Intent(Intent.ACTION_VIEW);
                buyIntent.setData(Uri.parse(buyUrl));
                startActivity(buyIntent);
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productUrl = "https://alexandrechristie.com/men-collection?product_id=1955&sort=p.date_added&order=DESC";

                String shareMessage = "Temukan Alexandre Christie 6653 MCB Jam tangan seharga Rp1.430.000. Dapatkan sekarang lewat LUXURY WATCH!\n" + productUrl;

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}
