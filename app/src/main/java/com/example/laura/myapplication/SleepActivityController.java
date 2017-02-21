package com.example.laura.good_morning;
import java.lang.Object;
import java.util.*;
import java.time.*;
/**
 * Created by Laura on 2/7/2017.
 */

public class SleepActivityController {
    public boolean sleepStatus;
    public Day day;
    public Date date;

    public SleepActivityController(){
        this.sleepStatus= false;
        date = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
    }

    public boolean getSleepStatus(){
        return sleepStatus;
    }
    public void setSleepStatus(boolean status) {
        sleepStatus = status;
        if (sleepStatus == true) {
            date.getTime();
            day.setDayEnd(date);
        }
    }
}