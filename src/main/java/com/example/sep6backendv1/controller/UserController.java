package com.example.sep6backendv1.controller;

import com.example.sep6backendv1.Service.IMovieService;
import com.example.sep6backendv1.Service.IUserService;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @GetMapping("/getUserByUsername")
    public User getUserByUsername(String username) {
        User user = userService.getUserById(username);
        return user;
    }

    @PostMapping("/registerUser")
    public User registerUser() {
/*        System.out.println("00000000");
        userService.checkUser(user.getUsername());
        System.out.println("111111");
        if (user.getUsername()!=null){
            System.out.println("user exists");
            return null;
        }
        else
            System.out.println(" adding user.....");
            return userService.addUser(user.getUsername(),user.getPassword(), user.getNickname());*/
    return userService.addUser("ni1","asd","asd");


    }

    @GetMapping("/getMovieList")
    public List<Movie> getMovieList(String username) {
        System.out.println("getMovieList");
       return  userService.getMovieList(username);
    }


    @PostMapping("/addMovieToList")
    public void addMovieToList(String username,int id) {
        System.out.println("addMovieToList");
 userService.addMovieToList(username,id);
    }



}
