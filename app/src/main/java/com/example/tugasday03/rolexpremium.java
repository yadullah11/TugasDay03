package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class rolexpremium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolexpremium);

        Button buyButton = findViewById(R.id.btnbuypremium);
        Button shareButton = findViewById(R.id.btnsharepremium);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buyUrl = "https://www.chrono24.co.id/rolex/rolex-steel-and-yellow-gold-rolesor-datejust-41-watch--fluted-bezel--black-diamond-dial-jubilee--id25330282.htm?searchHash=e13db646_enJuk4&pos=8";

                Intent buyIntent = new Intent(Intent.ACTION_VIEW);
                buyIntent.setData(Uri.parse(buyUrl));
                startActivity(buyIntent);
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productUrl = "https://www.chrono24.co.id/rolex/rolex-steel-and-yellow-gold-rolesor-datejust-41-watch--fluted-bezel--black-diamond-dial-jubilee--id25330282.htm?searchHash=e13db646_enJuk4&pos=8";

                String shareMessage = "Temukan Rolex STEEL AND YELLOW GOLD Jam tangan seharga Rp298.000.000. Dapatkan sekarang lewat LUXURY WATCH!\n" + productUrl;

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}
