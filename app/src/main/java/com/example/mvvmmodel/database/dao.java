package com.example.mvvmmodel.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mvvmmodel.Datamodel;

import java.util.List;
@Dao
public interface  dao  {

    @Insert
    void insertall(Datamodel dm);

    @Query("select * from student_data")
    LiveData<List<Datamodel>> getAll();



}
