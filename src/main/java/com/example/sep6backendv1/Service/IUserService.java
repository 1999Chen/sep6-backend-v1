package com.example.sep6backendv1.Service;

import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    User getUserById(String username) ;
/*    String get(String id);*/
    User checkUser(String username);
    User addUser(String username,String password,String nickname);

    List<Movie> getMovieList(String username);
    void addMovieToList(String username,int id);


}
