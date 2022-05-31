package com.example.sep6backendv1.controller;

import com.example.sep6backendv1.Service.IMovieService;
import com.example.sep6backendv1.Service.IUserService;
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
    public User registerUser(String username,String password,String nickname) {
        System.out.println("00000000");
        User user = userService.checkUser(username);
        System.out.println("111111");
        if (user==null){
            System.out.println("user is null");
            return null;
        }
        else
            System.out.println(" adding user.....");
            return userService.addUser(username,password,nickname);
    }

}
