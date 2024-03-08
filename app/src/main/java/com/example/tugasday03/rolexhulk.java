package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class rolexhulk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolexhulk);

        Button buyButton = findViewById(R.id.btnbuyhulk);
        Button shareButton = findViewById(R.id.btnsharehulk);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buyUrl = "https://www.chrono24.co.id/rolex/rolex-in-stocksubmarinerhulknewy2019--id26393324.htm?searchHash=4090f97a_w7OQbq&pos=1";

                Intent buyIntent = new Intent(Intent.ACTION_VIEW);
                buyIntent.setData(Uri.parse(buyUrl));
                startActivity(buyIntent);
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productUrl = "https://www.chrono24.co.id/rolex/rolex-in-stocksubmarinerhulknewy2019--id26393324.htm?searchHash=4090f97a_w7OQbq&pos=1";

                String shareMessage = "Temukan Rolex HULK SUBMARINE Jam tangan seharga Rp418.000.000. Dapatkan sekarang lewat LUXURY WATCH!\n" + productUrl;

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}
