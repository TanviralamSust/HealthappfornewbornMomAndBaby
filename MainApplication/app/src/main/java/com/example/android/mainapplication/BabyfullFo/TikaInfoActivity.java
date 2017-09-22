package com.example.android.mainapplication.BabyfullFo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.mainapplication.R;
import com.example.android.mainapplication.TikaName.BcgActivity;
import com.example.android.mainapplication.TikaName.HepaTaitisBActivity;
import com.example.android.mainapplication.TikaName.InfluenzaActivity;
import com.example.android.mainapplication.TikaName.JolbosontoActivity;
import com.example.android.mainapplication.TikaName.MMRTikaActivity;
import com.example.android.mainapplication.TikaName.PolioActivity;

public class TikaInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tika_info);
    }

    public void influenza(View view) {
        Intent i = new Intent(TikaInfoActivity.this, InfluenzaActivity.class);
        startActivity(i);
    }

    public void jolobosto(View view) {
        Intent i = new Intent(TikaInfoActivity.this, JolbosontoActivity.class);
        startActivity(i);
    }

    public void heptaitisB(View view) {
        Intent i = new Intent(TikaInfoActivity.this, HepaTaitisBActivity.class);
        startActivity(i);
    }

    public void polioTika(View view) {
        Intent i = new Intent(TikaInfoActivity.this, PolioActivity.class);
        startActivity(i);
    }

    public void bCg(View view) {
        Intent i = new Intent(TikaInfoActivity.this, BcgActivity.class);
        startActivity(i);
    }
    public void mmrtika(View view) {
        Intent i = new Intent(TikaInfoActivity.this, MMRTikaActivity.class);
        startActivity(i);
    }
}
