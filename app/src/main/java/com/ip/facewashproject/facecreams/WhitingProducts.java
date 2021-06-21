package com.ip.facewashproject.facecreams;

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

public class WhitingProducts extends AppCompatActivity {

    Button checkbtn,whiteningCreamP1Btn,whiteningCreamP2Btn;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_whiting_products);

        checkbtn = findViewById(R.id.checkbtn);
        whiteningCreamP1Btn = findViewById(R.id.whiteningCreamP1Btn);
        whiteningCreamP2Btn = findViewById(R.id.whiteningCreamP2Btn);

        checkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "WhitingProducts";
                Intent intent = new Intent(getApplicationContext(), YoutubeVideoActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        whiteningCreamP1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "whiteningCreamP1Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
        whiteningCreamP2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "whiteningCreamP2Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
    }
}