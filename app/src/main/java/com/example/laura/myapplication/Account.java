package com.example.laura.good_morning;

/**
 * Created by Laura on 2/5/2017.
 */

public class Account {

    public static String zipcode;
    public static int prepTime;
    public static String email;

    public Record record;

    public Account(String zipcode,int prepTime, String email){
        this.zipcode = zipcode;
        this.prepTime = prepTime;
        this.email = email;

    }
    public String getZipcode(){
        return zipcode;
    }
    public void setZipcode(String zip){
        zipcode=zip;
    }

    public int getPrepTime(){
        return prepTime;
    }
    public void setPrepTime(int prep){
        prepTime=prep;
    }

    public void setRecord(Record record){ this.record = record; }
}
