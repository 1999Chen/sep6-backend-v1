package com.example.sep6backendv1.model;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "users")
public class User {
 private String username;
    private String nickname;
    private String password;
    private int age;
    private String description;
    private String gender;

    public User() {
    }

    public User(String username, String nickname, String password, int age, String description, String gender) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.age = age;
        this.description = description;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
