package com.example.good_morning;
import android.os.*;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import android.app.Activity;

import com.example.good_morning.R;

/**
 * Created by Laura on 2/13/2017.
 */

public class AlarmActivityView extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_activity);

        Button alarmOffButton= (Button)findViewById(R.id.bAlarmOff);

        alarmOffButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View alarm_activity){

                    }
                }
        );
    }
}
