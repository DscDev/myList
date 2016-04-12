package com.example.ruben.mylist;

public class Pokemon {

    private String name;
    private String nickname;
    private String image;

    public Pokemon(String name, String nickname, String image) {
        this.name = name;
        this.nickname = nickname;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
