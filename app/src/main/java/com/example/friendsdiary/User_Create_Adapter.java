package com.example.friendsdiary;

public class User_Create_Adapter {
    private String name,like,hate,introduction;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getLike() {
        return like;
    }
    public void setLike(String like) {
        this.like = like;
    }

    public String getHate() {
        return hate;
    }
    public void setHate(String hate) {
        this.hate = hate;
    }

    public String getIntroduction() {
        return introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public User_Create_Adapter(String name, String like, String hate, String introduction) {
        this.name = name;
        this.like = like;
        this.hate = hate;
        this.introduction = introduction;
    }
}
