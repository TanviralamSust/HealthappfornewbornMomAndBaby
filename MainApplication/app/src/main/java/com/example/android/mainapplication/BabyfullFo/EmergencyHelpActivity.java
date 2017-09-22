package com.example.android.mainapplication.BabyfullFo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.mainapplication.EmergencyHlepLinePackage.BarishalActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.ChittagongActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.DhakaActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.KhulnaActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.RajshahiActivity;
import com.example.android.mainapplication.EmergencyHlepLinePackage.SylhetActivity;
import com.example.android.mainapplication.R;

public class EmergencyHelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_help);
    }
    public void dhakadiv(View view) {
        Intent i = new Intent(EmergencyHelpActivity.this, DhakaActivity.class);
        startActivity(i);
    }

    public void chittagongdiv(View view) {
        Intent i = new Intent(EmergencyHelpActivity.this, ChittagongActivity.class);
        startActivity(i);
    }

    public void barishaldiv(View view) {
        Intent i = new Intent(EmergencyHelpActivity.this, BarishalActivity.class);
        startActivity(i);
    }

    public void sylhetdiv(View view) {
        Intent i = new Intent(EmergencyHelpActivity.this, SylhetActivity.class);
        startActivity(i);
    }

    public void rajshahidiv(View view) {
        Intent i = new Intent(EmergencyHelpActivity.this, RajshahiActivity.class);
        startActivity(i);
    }

    public void khulnadiv(View view) {
        Intent i = new Intent(EmergencyHelpActivity.this, KhulnaActivity.class);
        startActivity(i);
    }
}
