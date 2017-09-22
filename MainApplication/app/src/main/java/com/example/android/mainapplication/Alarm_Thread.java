package com.example.android.mainapplication;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by NIHAL on 10/29/2016.
 */
public class Alarm_Thread  {
    private long currentmilli,startAlarm ,curr ;
    private long convert = 60000;
    static MediaPlayer mp;
    private static Context context;

    public  Alarm_Thread(Context context){
        this.context = context;
    }
    public void  setalarm(){
        curr =  System.currentTimeMillis();
        Realm realm = Realm.getInstance(context);
        Log.i("tanvir","strt ="+New_Medicine.startmillis);
        Log.i("tanvir","end ="+New_Medicine.endmillis);
        Log.i("tanvir","gap ="+New_Medicine.milliTymGap);
        Log.i("tanvir","curr ="+curr);
        int count=1;
        for (long i = New_Medicine.startmillis;i<=New_Medicine.endmillis;i+=New_Medicine.milliTymGap){
            Log.i("nihal1"," count = "+count);
            Log.i("tanvir","gap ="+New_Medicine.milliTymGap);
            Log.i("nihal1"," start = "+New_Medicine.startmillis);
            Log.i("nihal1"," end = "+New_Medicine.endmillis);
            Log.i("nihal1"," i = "+i);


            realm.beginTransaction();
            Alarm_Time alarm_time = realm.createObject(Alarm_Time.class);
            alarm_time.setId(count++);
            alarm_time.setTimegap(i);
            alarm_time.setMedicineName(New_Medicine.medicineName);
            realm.commitTransaction();

            //Toast.makeText(context,"entered the loop", LENGTH_LONG).show();


        }

        Log.i("nihal1"," count0 = "+count);
        Log.i("nihal1"," gap = "+New_Medicine.milliTymGap);
        Log.i("nihal1"," start0 = "+New_Medicine.startmillis);
        Log.i("nihal1"," end0 = "+New_Medicine.endmillis);
       // Log.i("nihal1"," i = "+i);
       RealmResults<Alarm_Time> alarms = realm.where(Alarm_Time.class).findAll();
        ArrayList<Long>arrayList = new ArrayList<>();
        for (int i = 0;i<alarms.size();i++){
            final int pos = i;
             arrayList.add(alarms.get(pos).getTimegap());
            Log.i("tanvir23",""+arrayList);
       }
       /* Log.i("tanvir",""+alarms.size());
        for(int i= 0;i<=alarms.size();i++){
            Log.i("tanvir",""+alarms);
        }*/
        realm.close();

      /*  curr =  System.currentTimeMillis();
        startAlarm = New_Medicine.startmillis - curr;
        currentmilli = startAlarm;
        final Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if(New_Medicine.endmillis<=currentmilli){
                    currentmilli+=currentmilli+New_Medicine.milliTymGap;
                    mp = MediaPlayer.create(context, R.raw.tone);
                    mp.setLooping(true);
                    mp.start();
                    Log.d("simul", "notification");

                }else{

                    t.cancel();
                }
            }

        }, startAlarm, 10000);*/

    }

}
