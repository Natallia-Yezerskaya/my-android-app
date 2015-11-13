package com.natallia.myfirstapplication;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 12.11.15.
 */
public class Person {
    int id;
    String name;
    String surname;
    int age;
    boolean isDegree;

    public Person(int id, String name, String surname, int age, boolean isDegree) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isDegree = isDegree;

    }
    public Person(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getInt("id");
        this.name = jsonObject.getString("name");
        this.surname =jsonObject.getString("surname");
        this.age =jsonObject.getInt("age");
        this.isDegree =jsonObject.getBoolean("isDegree");

    }
    public String toString() {
        return "id " + this.id + ", name:" + this.name + ", surname:" + this.surname + ", age:" + this.age +
                ", isDegree:" + this.isDegree;
    }

    public String getFullName() {
        return name+ " "+ surname;
    }
}
