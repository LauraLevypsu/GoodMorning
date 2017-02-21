package com.example.laura.good_morning;
import java.util.*;
import java.lang.Object;
import java.time.*;
import java.util.Calendar;
/**
 * Created by Laura on 2/5/2017.
 */

public class AlarmActivityController {
    public Date alarmTime;
    public boolean alarmStatus;
    public Day day;
    public Date date;

    public AlarmActivityController(Date alarmTime){
        this.alarmTime=alarmTime;
        this.alarmStatus= false;
        date = new Date();
        Calendar cal = new GregorianCalendar();
        //GregorianCalendar() = concrete subclass of Calendar.
        cal.setTime(date);
        date.getTime();
    }

    public boolean getAlarmStatus(){
        return alarmStatus;
    }
    public void setAlarmStatus(boolean status){
        alarmStatus = status;
        if (alarmStatus == true){
            date.getTime();
            day.setDayEnd(date);
        }
    }
}
