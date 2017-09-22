package com.example.android.mainapplication.MultipleTikaAlarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.android.mainapplication.MainActivity;
import com.example.android.mainapplication.R;

public class TikaThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tika_three_ativity);
    }
    public void setAlarm(View view) {
        Toast.makeText(TikaThreeActivity.this,"Your alarm has been created !!",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(TikaThreeActivity.this,SetAlarmPage.class);
        startActivity(intent);
    }
    public void backtomainmenu(View view) {
        Intent intent = new Intent(TikaThreeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
