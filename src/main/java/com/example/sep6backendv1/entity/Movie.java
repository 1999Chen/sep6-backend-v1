package com.example.sep6backendv1.entity;

public class Movie {
    private int id;

    public Movie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String toString() {
        return "Movie{" +
                "id=" + id +
                '}';
    }
}
