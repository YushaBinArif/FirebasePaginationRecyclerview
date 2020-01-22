package com.example.user.firebasepaginationrecyclerview.Model;

public class User {
    private String id, name, country, gender, uid;

    public User() {
    }

    public User(String id, String name, String country, String gender, String uid) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.gender = gender;
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
