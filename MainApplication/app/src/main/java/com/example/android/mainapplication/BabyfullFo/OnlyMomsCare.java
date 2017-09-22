package com.example.android.mainapplication.BabyfullFo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.mainapplication.PregnentMom.MomsTika;
import com.example.android.mainapplication.R;

public class OnlyMomsCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_moms_care);
    }

    public void momsVacine(View view) {
        Intent i = new Intent(OnlyMomsCare.this, MomsTika.class);
        startActivity(i);
    }
}
