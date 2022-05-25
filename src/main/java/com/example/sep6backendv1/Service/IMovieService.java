package com.example.sep6backendv1.Service;

import com.example.sep6backendv1.entity.Movie;

import java.util.List;

public interface IMovieService {
    Movie getBy(String id);
    List<Movie> getMovieById(String id);
/*    String get(String id);*/

}
