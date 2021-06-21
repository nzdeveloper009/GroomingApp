package com.ip.facewashproject.facecreams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ip.facewashproject.R;

public class FaceCreams extends AppCompatActivity {
    Button gelbtn,whitebtn,creambtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_face_creams);
       
        gelbtn=findViewById(R.id.gelbtn);
        whitebtn=findViewById(R.id.whiteningbtn);
        creambtn=findViewById(R.id.creambtn);
        gelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Shavingproducts.class);
                startActivity(intent);
            }
        });
        whitebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),WhitingProducts.class);
                startActivity(intent);
            }
        });
        creambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),moisturizeProducts.class);
                startActivity(intent);
            }
        });
    }
}