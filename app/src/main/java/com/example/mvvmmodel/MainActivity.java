package com.example.mvvmmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvmmodel.database.dao;
import com.example.mvvmmodel.database.Databasecls;
import com.example.mvvmmodel.databinding.ActivityMainBinding;
import com.example.mvvmmodel.datamodels.Studentdatamodel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
Studentdatamodel studentdatamodel;
Databasecls db;
dao dao;
rvadepter rvadepter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        studentdatamodel= new ViewModelProvider(this).get(Studentdatamodel.class);


        binding.rv.setLayoutManager(new LinearLayoutManager(this));

        studentdatamodel.getList().observe(this, new Observer<List<Datamodel>>() {
            @Override
            public void onChanged(List<Datamodel> datamodels) {
                rvadepter=new rvadepter(datamodels);
            }
        });
        binding.rv.setAdapter(rvadepter);

        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Datamodel model =new Datamodel(binding.name.getText().toString(),binding.age.getText().toString(),binding.education.getText().toString());
                studentdatamodel.insertData(model);
                rvadepter.notifyDataSetChanged();
                binding.name.setText("");
                binding.age.setText("");
                binding.education.setText("");
            }
        });
    }
}