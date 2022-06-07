package com.example.sep6backendv1.controller;

import com.example.sep6backendv1.Service.IMovieService;
import com.example.sep6backendv1.Service.IUserService;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.model.Movielist;
import com.example.sep6backendv1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;


    @GetMapping("/getUserByUsername")
    public User getUserByUsername(String username) {
        System.out.println("controller get user by name is start "+username);
        User user = userService.getUserById(username);
        System.out.println("controller get user by name is finished "+username);
        return user;
    }

    @PostMapping("/registerUser")
    public User registerUser(@RequestBody User user) {
        System.out.println("username"+user.getUsername());
        User newUser = userService.checkUser(user.getUsername());
        System.out.println("111111");
        if (newUser!=null){
            System.out.println("user exists");
            return null;
        }
        else
            System.out.println(" adding user.....");
            return userService.addUser(user.getUsername(),user.getPassword(), user.getNickname());
    }

    @GetMapping("/getMovieList")
    public List<Movie> getMovieList(String username) {
        System.out.println("getMovieList");
       return  userService.getMovieList(username);
    }


    @PostMapping("/addMovieToList")
    public void addMovieToList(@RequestBody Movielist movielist) {
        System.out.println("addMovieToList");
        System.out.println("addMovie username "+movielist.getUsername());
        System.out.println("addMovie id "+movielist.getId());
        userService.addMovieToList(movielist);
    }



}
