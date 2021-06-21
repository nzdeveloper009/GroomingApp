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

public class oliProducts extends AppCompatActivity {
    Button checkbtn,oilProducts1Btn,oilProducts2Btn,oilProducts3Btn;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_oli_products);

        checkbtn = findViewById(R.id.checkbtn);
        oilProducts1Btn = findViewById(R.id.oilProducts1Btn);
        oilProducts2Btn = findViewById(R.id.oilProducts2Btn);
        oilProducts3Btn = findViewById(R.id.oilProducts3Btn);

        checkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "oliProducts";
                Intent intent = new Intent(getApplicationContext(), YoutubeVideoActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        oilProducts1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "oilProducts1Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        oilProducts2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "oilProducts2Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        oilProducts3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "oilProducts3Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
    }
}