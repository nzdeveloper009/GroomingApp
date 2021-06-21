package com.ip.facewashproject.Hairproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ip.facewashproject.R;
import com.ip.facewashproject.perfumesproducts.ShampoProducts;

public class HaircareProducts extends AppCompatActivity {
    Button sparybtn,oilbtn,shampobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_haircare_products);

        sparybtn=findViewById(R.id.sprybtn);
        oilbtn=findViewById(R.id.oilbtn);
        shampobtn=findViewById(R.id.shmpobtn);

        sparybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Hairspray.class);
                startActivity(intent);
            }
        });
        oilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), oliProducts.class);
                startActivity(intent);
            }
        });
        shampobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShampoProducts.class);
                startActivity(intent);
            }
        });

    }
}