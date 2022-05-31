package com.example.sep6backendv1.Service;

import com.example.sep6backendv1.model.People;

import java.util.List;

public interface IPeopleService {

    List<People> selectStarsByMovie(int movieId);
    List<People> selectDirectorsByMovie(int movieId);
    People selectPeople(int id);
    People selectDirectorById(int id);
    People selectStarById(int id);

}
