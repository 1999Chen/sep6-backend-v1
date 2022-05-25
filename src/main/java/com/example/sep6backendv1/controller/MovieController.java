package com.example.sep6backendv1.controller;

import com.example.sep6backendv1.Service.IMovieService;
import com.example.sep6backendv1.Service.Impl.MovieServiceImpl;
import com.example.sep6backendv1.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController

@RequestMapping("/movie")
public class MovieController {

/*
    @Autowired
    private IMovieService movieService;*/

    private MovieServiceImpl movieService ;

    @GetMapping("/show")
    public List<Movie> show(String id){
        movieService = new MovieServiceImpl();
        System.out.println("gettting!!!"+id);
        return movieService.getMovieById(id);
    }


    @GetMapping("/hi")
    public Movie hi(String id){
        movieService = new MovieServiceImpl();
        System.out.println("gettting!!!"+id);
        return movieService.getBy(id);
    }

}
