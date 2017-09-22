package com.example.android.mainapplication.MultipleTikaAlarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.mainapplication.MainActivity;
import com.example.android.mainapplication.R;

public class SetAlarmPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_alarm_page);
    }

    public void backmainmenu(View view) {
        Intent intent  = new Intent(SetAlarmPage.this, MainActivity.class);
        startActivity(intent);
    }
}
