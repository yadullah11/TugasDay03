package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class hublotfullcarbon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hublotfullcarbon);

        Button buyButton = findViewById(R.id.btnbuyfullcarbon);
        Button shareButton = findViewById(R.id.btnsharefullcarbon);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buyUrl = "https://www.hublot.com/en-id/watches/big-bang/big-bang-integrated-tourbillon-full-carbon-43-mm";

                Intent buyIntent = new Intent(Intent.ACTION_VIEW);
                buyIntent.setData(Uri.parse(buyUrl));
                startActivity(buyIntent);
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productUrl = "https://www.hublot.com/en-id/watches/big-bang/big-bang-integrated-tourbillon-full-carbon-43-mm";

                String shareMessage = "Temukan Hublot INTEGRATED TOURBILLON FULL CARBON Jam tangan seharga Rp1.990.000.000. Dapatkan sekarang lewat LUXURY WATCH!\n" + productUrl;

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}
