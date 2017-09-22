package com.example.android.mainapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class ShowMedicineTimeActivity extends AppCompatActivity {


    //UserDatabase userdatabase = students .where().equalTo("userId",prefs.getString(QRActivity.USER_ID_AFTER_LOGIN,"jpt")).equalTo("userName",prefs.getString(QRActivity.USER_NAME_AFTER_LOGIN,"jpt")).findFirst();

   // Alarm_Time viewList = alarms.where().equalTo("getTimegap",);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_show_medicine_time);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Realm realm = Realm.getInstance(ShowMedicineTimeActivity.this);
        RealmResults<Alarm_Time> alarms = realm.where(Alarm_Time.class).findAll();
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i = 0;i<alarms.size();i++){
            final int pos = i;
            arrayList.add(alarms.get(pos).getTimegap());
            Log.i("tanvir22"," list number"+ arrayList);
        }

        ListView listView = (ListView) findViewById(R.id.show_medicine_list);
        ArrayAdapter<Long> adapter = new ArrayAdapter<Long>(getApplicationContext(),R.layout.medicine_list_layout,R.id.textView,arrayList);
        listView.setAdapter(adapter);
    }

}
