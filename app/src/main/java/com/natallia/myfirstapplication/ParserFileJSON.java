package com.natallia.myfirstapplication;

import org.json.*;

import java.util.ArrayList;

/**
 * Created by Administrator on 12.11.15.
 */
public class ParserFileJSON {
    public static ArrayList<Person> getArraylist(String s){
        ArrayList<Person> arrayPerson = new ArrayList<Person>();
        try {
        JSONObject jsonObject = new JSONObject(s);
        JSONArray jpeople = null;
        jpeople = jsonObject.getJSONArray("people");

        for (int i = 0; i <jpeople.length() ; i++) {
            arrayPerson.add(new Person(jpeople.optJSONObject(i)));
        }
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        return arrayPerson;
    }

}
