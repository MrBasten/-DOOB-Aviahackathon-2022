package com.example.my_application.data;

import com.example.my_application.R;
import com.example.my_application.data.model.LoggedInUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import android.content.Context;
import android.util.Log;

public class Schedule {
    private LoggedInUser user;
    Context context;

    public Schedule (LoggedInUser user, Context context) {
        this.user = user;
        this.context = context;
    }

    public ArrayList<Task> Get_Tasks() {// читает из данные из таблицы и превращает в список типа Task
        ArrayList<Task> tasks = new ArrayList<>();
        try {
            InputStream fin = context.getResources().openRawResource(R.raw.drivers_schedule);
            InputStreamReader reader = new InputStreamReader(fin);
            BufferedReader bR = new BufferedReader(reader);
            String line;
            while((line = bR.readLine()) != null) {
                String [] Task_info = line.split(",");
                if (Task_info[0].equals(user.getUserId())) {
                    tasks.add(new Task(Task_info));
                }
            }
        } catch (IOException e) {
            Log.e("stream error", "schedule.java");
        }
        return tasks;
    }
}
