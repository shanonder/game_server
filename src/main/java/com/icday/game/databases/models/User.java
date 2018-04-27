package com.icday.game.databases.models;

public class User {
    private String id;

    private String userName;

    private String password;

    private Byte antiAddiction;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getAntiAddiction() {
        return antiAddiction;
    }

    public void setAntiAddiction(Byte antiAddiction) {
        this.antiAddiction = antiAddiction;
    }
}