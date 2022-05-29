package com.example.sep6backendv1.controller;


import com.example.sep6backendv1.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/test")
    public Movie test(int id) {
        return new Movie(id, 1999, "the movie with id " + id);
    }

    @GetMapping("/testlist")
    public List<Movie> testlist(int id) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie(1, 1999, "movie 1"));
        list.add(new Movie(2, 1988, "movie 2"));
        list.add(new Movie(3, 1980, "movie 2"));
        return list;
    }


}