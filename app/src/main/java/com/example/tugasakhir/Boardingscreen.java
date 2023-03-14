package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Boardingscreen extends AppCompatActivity {

    ViewPager mSLiderPager;
    LinearLayout mDotLayout;
    Button skipbtn;
    ViewpagAdaptor viewpagAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boardingscreen);
        skipbtn = findViewById(R.id.btnSkip);
        skipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Boardingscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        mSLiderPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.indicator_lay);
        viewpagAdaptor = new ViewpagAdaptor(this);

    }
}