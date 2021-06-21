package com.ip.facewashproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.ip.facewashproject.Hairproducts.HaircareProducts;
import com.ip.facewashproject.facecreams.FaceCreams;
import com.ip.facewashproject.facescrub.FaceScrub;
import com.ip.facewashproject.facewash.FaceWash;
import com.ip.facewashproject.perfumesproducts.PerfumesProducts;

public class MainActivity extends AppCompatActivity {
    CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        cardView1=findViewById(R.id.carditem1);
        cardView2=findViewById(R.id.carditem2);
        cardView3=findViewById(R.id.carditem3);
        cardView4=findViewById(R.id.carditem4);
        cardView5=findViewById(R.id.carditem5);
        cardView6=findViewById(R.id.carditem6);
        cardView7=findViewById(R.id.carditem7);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), FaceWash.class);
                startActivity(intent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), FaceScrub.class);
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), FaceCreams.class);
                startActivity(intent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), PerfumesProducts.class);
                startActivity(intent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BodyWash.class);
                startActivity(intent);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BodyCare.class);
                startActivity(intent);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), HaircareProducts.class);
                startActivity(intent);
            }
        });
    }
}