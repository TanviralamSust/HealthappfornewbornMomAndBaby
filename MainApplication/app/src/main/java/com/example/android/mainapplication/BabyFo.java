package com.example.android.mainapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.android.mainapplication.BabyfullFo.EmergencyActivity;
import com.example.android.mainapplication.BabyfullFo.FoodActivity;

/**
 * Created by NIHAL on 11/4/2016.
 */
public class BabyFo  extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_baby_fo);



    }

    public void tikainfo(View view) {
        Intent i = new Intent(BabyFo.this, MainActivity.class);
        startActivity(i);
    }

    public void foodchart(View view) {
        Intent i = new Intent(BabyFo.this, FoodActivity.class);
        startActivity(i);
    }

    public void helpline(View view) {
        Intent i = new Intent(BabyFo.this, EmergencyActivity.class);
        startActivity(i);
    }

    public void mothercare(View view) {
        Intent i = new Intent(BabyFo.this, MainActivity.class);
        startActivity(i);
    }
}
