package com.example.pet.orderfoods280918.Model;

/**
 * Created by DELL on 9/29/2018.
 */

public class User {
    private String Date;
    private String Password;

    public User(String date, String password) {
        Date = date;
        Password = password;
    }
    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
