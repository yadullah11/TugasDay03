package com.example.tugasday03;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class rolexdaytona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolexdaytona);

        Button buyButton = findViewById(R.id.btnbuydaytona);
        Button shareButton = findViewById(R.id.btnsharedaytona);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buyUrl = "https://www.istyle.id/p-rolex-daytona-116518ln-yellow-gold-meteorite-dial-oysterflex-000001739830?irclickid=zknSu2yexxyPUOixFJSuQSMZUkH39ExleyYwVk0&irgwc=1&utm_source=impact&utm_medium=affiliate&utm_campaign=376844_IPRICE%20VENTURES%20SDN.%20BHD";

                Intent buyIntent = new Intent(Intent.ACTION_VIEW);
                buyIntent.setData(Uri.parse(buyUrl));
                startActivity(buyIntent);
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productUrl = "https://www.istyle.id/p-rolex-daytona-116518ln-yellow-gold-meteorite-dial-oysterflex-000001739830?irclickid=zknSu2yexxyPUOixFJSuQSMZUkH39ExleyYwVk0&irgwc=1&utm_source=impact&utm_medium=affiliate&utm_campaign=376844_IPRICE%20VENTURES%20SDN.%20BHD";

                String shareMessage = "Temukan Rolex DAYTONA Jam tangan seharga Rp1.313.000.000. Dapatkan sekarang lewat LUXURY WATCH!\n" + productUrl;

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}
