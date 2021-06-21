package com.ip.facewashproject.perfumesproducts;

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

public class PerfumesProducts extends AppCompatActivity {


    Button checkbtn,perfumeP1Btn,perfumeP2Btn,perfumeP3Btn;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_perfumes_products);

        checkbtn = findViewById(R.id.checkbtn);
        perfumeP1Btn = findViewById(R.id.perfumeP1Btn);
        perfumeP2Btn = findViewById(R.id.perfumeP2Btn);
        perfumeP3Btn = findViewById(R.id.perfumeP3Btn);

        checkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "PerfumesProducts";
                Intent intent = new Intent(getApplicationContext(), YoutubeVideoActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        perfumeP1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "perfumeP1Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        perfumeP2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "perfumeP2Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        perfumeP3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "perfumeP3Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
    }
}