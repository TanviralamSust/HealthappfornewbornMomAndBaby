package com.example.android.mainapplication.MultipleTikaAlarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.mainapplication.MainActivity;
import com.example.android.mainapplication.R;
import com.example.android.mainapplication.Tika_page;

public class TikaChooseActivity extends AppCompatActivity {
    private Button onebaby,twobaby,threebaby,backmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tika_choose);
        onebaby = (Button)findViewById(R.id.one_baby);
        twobaby =(Button)findViewById(R.id.two_baby);
        threebaby =(Button)findViewById(R.id.three_baby);
        backmenu =(Button)findViewById(R.id.back_main);
        onebaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TikaChooseActivity.this, TikaOneActivity.class);
                startActivity(intent);
            }
        }
        );
        twobaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TikaChooseActivity.this,TikaTwoActivity.class);
                startActivity(intent);
            }
        });
        threebaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TikaChooseActivity.this,TikaThreeActivity.class);
                startActivity(intent);
            }
        });
        backmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TikaChooseActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
