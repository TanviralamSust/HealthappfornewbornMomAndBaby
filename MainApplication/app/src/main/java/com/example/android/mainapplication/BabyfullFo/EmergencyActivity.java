package com.example.android.mainapplication.BabyfullFo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.android.mainapplication.EmergencyHlepLinePackage.BarishalActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.ChittagongActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.DhakaActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.KhulnaActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.RajshahiActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.SylhetActivity;
import com.example.android.mainapplication.R;

/**
 * Created by NIHAL on 11/4/2016.
 */
public  class EmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void dhakadiv(View view) {
        Intent i = new Intent(EmergencyActivity.this, DhakaActivity.class);
        startActivity(i);
    }

    public void chittagongdiv(View view) {
        Intent i = new Intent(EmergencyActivity.this, ChittagongActivity.class);
        startActivity(i);
    }

    public void barishaldiv(View view) {
        Intent i = new Intent(EmergencyActivity.this, BarishalActivity.class);
        startActivity(i);
    }

    public void sylhetdiv(View view) {
        Intent i = new Intent(EmergencyActivity.this, SylhetActivity.class);
        startActivity(i);
    }

    public void rajshahidiv(View view) {
        Intent i = new Intent(EmergencyActivity.this, RajshahiActivity.class);
        startActivity(i);
    }

    public void khulnadiv(View view) {
        Intent i = new Intent(EmergencyActivity.this, KhulnaActivity.class);
        startActivity(i);
    }
}
