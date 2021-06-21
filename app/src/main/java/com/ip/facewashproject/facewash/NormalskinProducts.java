package com.ip.facewashproject.facewash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ip.facewashproject.AmazonWebsite.BuyAmazonActivity;
import com.ip.facewashproject.R;

public class NormalskinProducts extends AppCompatActivity {

    Button normalSkinP1Btn,normalSkinP2Btn;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_normalskin_products);

        normalSkinP1Btn = findViewById(R.id.normalSkinP1Btn);
        normalSkinP2Btn = findViewById(R.id.normalSkinP2Btn);

        normalSkinP1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "normalSkinP1Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);

            }
        });
        normalSkinP2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "normalSkinP2Btn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);

            }
        });
    }
}