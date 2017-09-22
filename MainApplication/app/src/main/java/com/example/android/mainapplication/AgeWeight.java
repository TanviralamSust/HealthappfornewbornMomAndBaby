package com.example.android.mainapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.mainapplication.TikaName.Previous;
import com.example.android.mainapplication.TikaName.PreviousActivity;

public class AgeWeight extends AppCompatActivity {

    EditText age, wi;
    Button bt,bt2;


    double arr[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_weight);


        initArray();

        age = (EditText) findViewById(R.id.agewi);
        wi = (EditText) findViewById(R.id.agewikg);
        bt = (Button) findViewById(R.id.agewibtn);
        bt2 = (Button) findViewById(R.id.button2);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //store the input of age and weight in string//
                String a = age.getText().toString();
                String b = wi.getText().toString();

                //convert them into int//
                int m = Integer.parseInt(a);
                double d = Double.parseDouble(b);

                //after giving weight and age that coment box for result//
                AlertDialog.Builder builder = new AlertDialog.Builder(AgeWeight.this);
                builder.setTitle("Result for your Baby");
                //tv variable will show the result//
                TextView tv = new TextView(AgeWeight.this);
                builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        ;
                    }
                });
                //arr[m] = which is age && d =  weight//
                //by calculating it will show the matched result//
                String s="";
                if (Math.abs(arr[m] - d) <= 0.5) {
                    s = "Standard weight";
                    //tv.append("Standard Weight");
                } else if (arr[m] < d) {
                    s = "Over weight";
                    // tv.append("Over Weight");
                } else {
                    s = "Under weight";
                    //tv.append("Under Weight");
                }
                tv.append(s);
                //String result = s;

                builder.setView(tv);
                builder.show();

                SharedPreferences loginData = getSharedPreferences("weightInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = loginData.edit();
                editor.putString("age", age.getText().toString());
                editor.putString("wi", wi.getText().toString());
                editor.putString("result",s);
                editor.apply();
            }
        });
    }

    private void initArray() {
        arr = new double[100];
        arr[0] = 3.0;
        arr[1] = 4.4;
        arr[2] = 5.6;
        arr[3] = 6.4;
        arr[4] = 7.0;
        arr[5] = 7.5;
        arr[6] = 7.9;
        arr[7] = 8.3;
    }

   /* public void saveData() {
        SharedPreferences loginData = getSharedPreferences("weightInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = loginData.edit();
        editor.putString("age", age.getText().toString());
        editor.putString("wi", wi.getText().toString());
        editor.putString("result",this.s());
        editor.apply();


    }
*/





    public void previous(View view)
    {

        Intent intent = new Intent(AgeWeight.this,PreviousActivity.class);
        startActivity(intent);
        //startActivity(new Intent(getApplicationContext(),Previous.class ));
    }
}
