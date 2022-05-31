package com.example.sep6backendv1.controller;

import com.example.sep6backendv1.Service.IMovieService;
import com.example.sep6backendv1.Service.IPeopleService;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private IPeopleService peopleService;

    @GetMapping("/getPeopleById")
    public People getPeopleById(int id) {
        return peopleService.selectPeople(id);
    }


    @GetMapping("/getStarsByMovie")
    public List<People> getStarsById(int id) {
        return peopleService.selectStarsByMovie(id);
    }


    @GetMapping("/getDirectorsByMovie")
    public List<People> getDirectorsById(int id) {
        return peopleService.selectDirectorsByMovie(id);
    }

}
