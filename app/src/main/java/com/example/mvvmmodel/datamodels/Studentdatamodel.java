package com.example.mvvmmodel.datamodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmmodel.database.dao;
import com.example.mvvmmodel.Datamodel;
import com.example.mvvmmodel.Instances;

import java.io.Closeable;
import java.util.List;

public class Studentdatamodel extends AndroidViewModel {

    LiveData<List<Datamodel>> list;
    dao dao;


    public Studentdatamodel(@NonNull Application application) {
        super(application);
        dao= Instances.getInstance(application)
                .dao();
        list=dao.getAll();
    }

    public void insertData(Datamodel model){
        dao.insertall(model);
    }
    public LiveData<List<Datamodel>> getList() {
        return list;
    }

}
