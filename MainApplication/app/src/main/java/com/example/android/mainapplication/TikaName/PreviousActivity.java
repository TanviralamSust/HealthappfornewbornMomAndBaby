package com.example.android.mainapplication.TikaName;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.mainapplication.R;

public class PreviousActivity extends AppCompatActivity {
    TextView dataView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous);
        dataView = (TextView) findViewById(R.id.textView);
        SharedPreferences loginData = getSharedPreferences("weightInfo", Context.MODE_PRIVATE);
        String name = loginData.getString("age", "");
        String pw = loginData.getString("wi", "");
        String w = loginData.getString("result", "");
        String msg = "Saved age: " + name + "\nSaved weight: " + pw + "\nStatus: " + w;
        dataView.setText(msg);
    }
}
