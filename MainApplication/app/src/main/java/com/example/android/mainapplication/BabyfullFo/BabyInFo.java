package com.example.android.mainapplication.BabyfullFo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.mainapplication.R;

public class BabyInFo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_in_fo);
    }

    public void tikainfo(View view) {
        Intent i = new Intent(BabyInFo.this, TikaInfoActivity.class);
        startActivity(i);
    }

    public void foodchart(View view) {
        Intent i = new Intent(BabyInFo.this, FoodActivity.class);
        startActivity(i);
    }

    public void helpline(View view) {
        Intent i = new Intent(BabyInFo.this, EmergencyHelpActivity.class);
        startActivity(i);
    }

    public void mothercare(View view) {
        Intent i = new Intent(BabyInFo.this, OnlyMomsCare.class);
        startActivity(i);
    }
}
