package com.example.android.mainapplication.TikaName;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.mainapplication.R;

public class Previous extends AppCompatActivity {
    TextView dataView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.previous);


        dataView = (TextView) findViewById(R.id.textView);
        SharedPreferences loginData = getSharedPreferences("weightInfo", Context.MODE_PRIVATE);
        String name = loginData.getString("age", "");
        String pw = loginData.getString("wi", "");
        String w = loginData.getString("result", "");
        String msg = "Saved age: " + name + "\nSaved weight: " + pw + "\nStatus: " + w;
        dataView.setText(msg);
    }

   /* public void getData() {
        SharedPreferences loginData = getSharedPreferences("weightInfo", Context.MODE_PRIVATE);
        String name = loginData.getString("age", "");
        String pw = loginData.getString("wi", "");
        String msg = "Saved age: " + name + "\nSaved weight: " + pw;
        dataView.setText(msg);
    }*/
}


