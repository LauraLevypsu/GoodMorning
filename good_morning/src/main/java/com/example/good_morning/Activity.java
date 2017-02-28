package com.example.good_morning;
import java.util.*;
/**
 * Created by Laura on 2/5/2017.
 */

public class Activity {

    public String name;
    public Calendar cal;
    public String location;

    public Activity(String name, Calendar cal, String location){
        this.name= name;
        this.cal= cal;
        this.location= location;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        name=name;
    }

    public Calendar getCal(){
        return cal;
    }
    public void setTime(Date time){
        time=time;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        location=location;
    }

}
