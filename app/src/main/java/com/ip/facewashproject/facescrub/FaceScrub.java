package com.ip.facewashproject.facescrub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ip.facewashproject.R;
import com.ip.facewashproject.YoutubeVideo.YoutubeVideoActivity;

public class FaceScrub extends AppCompatActivity {
    Button oilybtn,normalbtn,drybtn,checkbtn;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_face_scrub);

        oilybtn=findViewById(R.id.oilybtn);
        normalbtn=findViewById(R.id.normalbtn);
        drybtn=findViewById(R.id.drybtn);
        checkbtn=findViewById(R.id.checkbtn);
        oilybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Oilyskinscrub.class);
                startActivity(intent);
            }
        });
        normalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),Normalproduct.class);
                startActivity(a);
            }
        });
        drybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Dryskinscrub.class);
                startActivity(i);
            }
        });
        checkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "FaceScrub";
                Intent i=new Intent(getApplicationContext(), YoutubeVideoActivity.class);
                i.putExtra("type",type);
                startActivity(i);
            }
        });

    }
}