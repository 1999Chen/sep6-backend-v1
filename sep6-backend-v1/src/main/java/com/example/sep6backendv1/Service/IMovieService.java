package com.example.sep6backendv1.Service;

import com.example.sep6backendv1.model.Movie;

import java.sql.SQLException;
import java.util.List;

public interface IMovieService {
    List<Movie> getMoviesByTitle(String title);
    List<Movie> getListTestById(int minYear, int maxYear) throws SQLException, ClassNotFoundException;
    List<Movie> getAllMovies() throws ClassNotFoundException, SQLException;
    Movie getMovieById(int id) ;
/*    String get(String id);*/

}
