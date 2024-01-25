package com.example.mvvmmodel;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_data")
public class Datamodel {

    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name="s_name")
    public String name;
    @ColumnInfo(name="s_age")
    public String age;
    @ColumnInfo(name="s_education")
    public String education;

    public Datamodel(String name, String age, String education) {
        this.name = name;
        this.age = age;
        this.education = education;
    }

    public Datamodel() {
    }

    public String getId() {
        return String.valueOf(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
