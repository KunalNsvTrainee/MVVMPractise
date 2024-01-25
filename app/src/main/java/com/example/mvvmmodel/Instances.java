package com.example.mvvmmodel;

import android.content.Context;

import androidx.room.Room;

import com.example.mvvmmodel.database.Databasecls;

public class Instances {
 private static  Databasecls db;

    public static Databasecls getInstance(Context context){
        if(db==null){
            return Room.databaseBuilder(context, Databasecls.class,"student_db").allowMainThreadQueries().build();

        }
         return db;
    }
}
