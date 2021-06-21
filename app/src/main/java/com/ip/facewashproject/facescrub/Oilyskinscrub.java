package com.ip.facewashproject.facescrub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ip.facewashproject.AmazonWebsite.BuyAmazonActivity;
import com.ip.facewashproject.R;

public class Oilyskinscrub extends AppCompatActivity {

    Button oilySkinScrubBtn;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_oilyskinscrub);

        oilySkinScrubBtn = findViewById(R.id.oilySkinScrubBtn);

        oilySkinScrubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "oilySkinScrubBtn";
                Intent intent = new Intent(getApplicationContext(), BuyAmazonActivity.class);
                intent.putExtra("type",type);
                startActivity(intent);

            }
        });

    }
}