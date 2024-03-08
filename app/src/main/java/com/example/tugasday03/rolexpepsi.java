package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class rolexpepsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolexpepsi);

        Button buyButton = findViewById(R.id.btnbuypepsi);
        Button shareButton = findViewById(R.id.btnsharepepsi);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buyUrl = "https://www.chrono24.co.id/rolex/rolex-rolex-gmt-master-ii-40mm-steel-pepsi--black-dial-oyster-bracelet-126710blro--id23025396.htm?searchHash=1085f240_W0xsa1&pos=2";

                Intent buyIntent = new Intent(Intent.ACTION_VIEW);
                buyIntent.setData(Uri.parse(buyUrl));
                startActivity(buyIntent);
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productUrl = "https://www.chrono24.co.id/rolex/rolex-rolex-gmt-master-ii-40mm-steel-pepsi--black-dial-oyster-bracelet-126710blro--id23025396.htm?searchHash=1085f240_W0xsa1&pos=2";

                String shareMessage = "Temukan Rolex GMT MASTER-II PEPSI Jam tangan seharga Rp402.000.000. Dapatkan sekarang lewat LUXURY WATCH!\n" + productUrl;

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}
