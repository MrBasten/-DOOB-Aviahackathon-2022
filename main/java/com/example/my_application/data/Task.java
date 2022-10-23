package com.example.my_application.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task {
    private String [] Taskinfo;
    private String [] path;
    public Task (String [] Task_info) {
        this.path = Task_info[9].split("-");

    }
    public long GetStartTime(){
        return  Long.parseLong(Taskinfo[4]);
    }
    public long GetBoardingStartTime(){
        return Long.parseLong(Taskinfo[5]);
    }
    public long GetBoardingEndTime(){
        return Long.parseLong(Taskinfo[4]);
    }
    public long GetArrivalTime(){
        return Long.parseLong(Taskinfo[4]);
    }
    public long GetEndTime(){
        return Long.parseLong(Taskinfo[4]);
    }

    public int GetStartPoint(){
        return Integer.parseInt(Taskinfo[1]);
    }
    public int GetStopPoint() {
        return Integer.parseInt(Taskinfo[2]);
    }
    public int GetEndPoint(){
        return Integer.parseInt(Taskinfo[3]);
    }

    public String[] GetPath(){
        return this.path;
    }
}
