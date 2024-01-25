package com.example.mvvmmodel.database;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.mvvmmodel.Datamodel;

@Database(entities = Datamodel.class,exportSchema = false,version = 1)
public abstract class Databasecls extends RoomDatabase {
    public abstract dao dao();
}
