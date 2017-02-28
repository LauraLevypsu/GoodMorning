package com.example.good_morning;
import java.util.*;
/**
 * Created by Laura on 2/5/2017.
 */

public class Record {
    public ArrayList<Day> days = new ArrayList<>();
    public double avgSleep;

    public Record(ArrayList<Day> inDays){
        days.equals(inDays); //will this line do what i hope it will?
    }

    public ArrayList<Day> getDays(){
        return days;
    }

    public double getAvgSleep(){
        int totalSleep=0;
        for(Day day: days){
            totalSleep+=day.getSleep();
        }
        this.avgSleep = totalSleep/days.size();
        return this.avgSleep;    // are there any risks to calling it this.avgSleep vs avgSleep?
    }
}
