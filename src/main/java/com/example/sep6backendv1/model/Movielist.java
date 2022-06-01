package com.example.sep6backendv1.model;

public class Movielist {
    private String username;
    private int id;

    public Movielist() {
    }

    public Movielist(String username, int id) {
        this.username = username;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
