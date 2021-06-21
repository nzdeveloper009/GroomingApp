package com.ip.facewashproject.facewash;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ip.facewashproject.AmazonWebsite.BuyAmazonActivity;
import com.ip.facewashproject.R;

public class OilyskinProducts extends AppCompatActivity {

    Button oilSkinP1Btn,oilSkinP2Btn,oilSkinP3Btn,oilSkinP4Btn;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_oilyskin_products);

        oilSkinP1Btn = findViewById(R.id.oilSkinP1Btn);
        oilSkinP2Btn = findViewById(R.id.oilSkinP2Btn);
        oilSkinP3Btn = findViewById(R.id.oilSkinP3Btn);
        oilSkinP4Btn = findViewById(R.id.oilSkinP4Btn);

        oilSkinP1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "oilSkinP1Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);

            }
        });
        oilSkinP2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "oilSkinP2Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);

            }
        });
        oilSkinP3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "oilSkinP3Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);

            }
        });
        oilSkinP4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "oilSkinP4Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);

            }
        });

    }
}