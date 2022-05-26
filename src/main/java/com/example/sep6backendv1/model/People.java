package com.example.sep6backendv1.model;

public class People {

    private String name;
    private int id;
    private int birth;

    public People() {
    }

    public People(String name, int id, int birth) {
        this.name = name;
        this.id = id;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }


    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birth=" + birth +
                '}';
    }
}
