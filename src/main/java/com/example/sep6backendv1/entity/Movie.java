package com.example.sep6backendv1.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "movies")
public class Movie {
    @TableField(value = "id")
    private int id;

    @TableField(value = "year")
    private int year;

    @TableField(value = "title")
    private String title;

    public Movie() {

    }

    public Movie(int id, int year, String title) {
        this.id = id;
        this.year = year;
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
