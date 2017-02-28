package com.example.good_morning;

import java.util.*;
import java.util.Date;
import java.lang.Object;

/**
 * Created by Laura on 2/9/2017.
 */

public class Day {

    public Date dayStart;
    public Date dayEnd;
    ArrayList<Activity> activities = new ArrayList<>();
    public int sleep;

    public Account account;
    private int prepTime;

    public Day() {
        this.prepTime= account.getPrepTime();
    }

    public Date getDayStart(){
        return dayStart;
    }
    public Date getDayEnd(){
        return dayEnd;
    }
    public void setDayEnd(Date date) { dayEnd = date; }
    public int getSleep(){ return sleep; }
}
