package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class rolexdeepsea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolexdeepsea);

        Button buyButton = findViewById(R.id.btnbuydeepsea);
        Button shareButton = findViewById(R.id.btnsharedeepsea);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buyUrl = "https://www.thetimeplace.co.id/rolex/rolex-watches/deepsea/m136660-0003/";

                Intent buyIntent = new Intent(Intent.ACTION_VIEW);
                buyIntent.setData(Uri.parse(buyUrl));
                startActivity(buyIntent);
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productUrl = "https://www.thetimeplace.co.id/rolex/rolex-watches/deepsea/m136660-0003/";

                String shareMessage = "Temukan Rolex DEEPSEA Jam tangan seharga Rp235.000.000. Dapatkan sekarang lewat LUXURY WATCH!\n" + productUrl;

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}
