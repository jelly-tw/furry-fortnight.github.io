package com.jelly.music_player;

public class UserAttestatInfo {
    private String name;
    private String password;
    private String passwordType;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPasswordType(String passwordType) {
        this.passwordType = passwordType;
    }

    public String getPasswordType() {
        return passwordType;
    }
}
