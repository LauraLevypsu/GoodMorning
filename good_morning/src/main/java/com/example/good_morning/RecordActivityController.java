package com.example.good_morning;
import java.util.*;
/**
 * Created by Laura on 2/12/2017.
 */

public class RecordActivityController {
    public ArrayList <Day> days;
    public Record record;
    public int pages;
    public int currentPage;

    public RecordActivityController(){
        days= record.getDays();
        pages = (days.size()/10)+1;
        currentPage= 1;
    }

    public void nextPage(){
        currentPage++;
    }
    public void prevPage(){
        currentPage--;
    }
    public int getCurrentPage(){
        return currentPage;
    }

}
