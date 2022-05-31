package com.example.sep6backendv1.controller;

import com.example.sep6backendv1.Service.IMovieService;
import com.example.sep6backendv1.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/movie")
public class MovieController {


    @Autowired
    private IMovieService movieService;

    @GetMapping("/getMovieById")
    public Movie getMovieById(int id) {
        return movieService.getMovieById(id);
    }

    @GetMapping("/getMoviesByYear")
    public List<Movie> getMoviesByYear(int minYear,int maxYear) throws SQLException, ClassNotFoundException {
        System.out.println("get!!!");
        return movieService.getListTestById(minYear,maxYear);
    }


    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies() throws SQLException, ClassNotFoundException {
        return movieService.getAllMovies();
    }


    @GetMapping("/getMoviesByTitle")
    public List<Movie> getMoviesByTitle(String title) throws SQLException, ClassNotFoundException {
        return movieService.getMoviesByTitle(title);
    }

    @GetMapping("/getMoviesByDirector")
    public List<Movie> getMoviesByDirector(int id)  {
        return movieService.getMoviesByDirector(id);
    }

    @GetMapping("/getMoviesByStar")
    public List<Movie> getMoviesByStar(int id)  {
        return movieService.getMoviesByStar(id);
    }

    @GetMapping("/testBy")
    public Movie testBy(int id) {
        return movieService.getMovieById(id);
    }

    @GetMapping("/getRatingById")
    public double getRatingById(int id) {
        return movieService.getRatingById(id);
    }

    @GetMapping("/getVotesById")
    public double getVotesById(int id) {
        return movieService.getVotesById(id);
    }


}