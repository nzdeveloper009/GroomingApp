package com.ip.facewashproject.Hairproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ip.facewashproject.AmazonWebsite.BuyAmazonActivity;
import com.ip.facewashproject.R;
import com.ip.facewashproject.YoutubeVideo.YoutubeVideoActivity;

public class Hairspray extends AppCompatActivity {

    Button checkbtn,hairSprayP1Btn,hairSprayP2Btn,hairSprayP3Btn,hairSprayP4Btn;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hairspray);

        checkbtn = findViewById(R.id.checkbtn);
        hairSprayP1Btn = findViewById(R.id.hairSprayP1Btn);
        hairSprayP2Btn = findViewById(R.id.hairSprayP2Btn);
        hairSprayP3Btn = findViewById(R.id.hairSprayP3Btn);
        hairSprayP4Btn = findViewById(R.id.hairSprayP4Btn);

        checkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "Hairspray";
                Intent intent = new Intent(getApplicationContext(), YoutubeVideoActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        checkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "Hairspray";
                Intent intent = new Intent(getApplicationContext(), YoutubeVideoActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        hairSprayP1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "hairSprayP1Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        hairSprayP2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "hairSprayP2Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        hairSprayP3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "hairSprayP3Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        hairSprayP4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "hairSprayP4Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
    }
}