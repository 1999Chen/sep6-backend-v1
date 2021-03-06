package com.example.sep6backendv1.Service.Impl;

import com.example.sep6backendv1.Service.IUserService;
import com.example.sep6backendv1.connection.MyBatisConnection;
import com.example.sep6backendv1.mapper.UserMapper;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.mapper.MovieMapper;
import com.example.sep6backendv1.model.Movielist;
import com.example.sep6backendv1.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements IUserService {


    UserMapper userMapper;

    public UserServiceImpl() throws ClassNotFoundException, SQLException {
        SqlSession ss = MyBatisConnection.getConnection();
        userMapper = ss.getMapper(UserMapper.class);

//        Class.forName("com.mysql.jdbc.Driver");
//
//        Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://35.204.25.150:3306/main_schema?sep6-350713:europe-west4:sep6sql",
//                "root",
//                "MTingCat819"
//        );
//
//        Statement st = conn.createStatement();
//        this.UserMapper = UserMapper;
    }

    @Override
    public User getUserById(String username) {

        System.out.println("get user serviceimpl"+username);
        User User = userMapper.selectUserByUsername(username);

        return  User;
    }

    @Override
    public User checkUser(String username) {
        User user = new User();
        user = userMapper.selectUserByUsername(username);
        return user;
    }

    @Override
    public User addUser(String username, String password, String nickname) {
        System.out.println("user mapper start");
        User user = new User(username,password,nickname);
        userMapper.insertAUser(new User(username,password,nickname));
        System.out.println("user mapper finished ");

        return user;
    }

    @Override
    public List<Movie> getMovieList(String username) {

        List<Movie> list = userMapper.getMovieList(username);
        System.out.println("list is "+list.size());
        System.out.println("list is "+list.size());
        return userMapper.getMovieList(username);
    }

    @Override
    public void addMovieToList(Movielist movielist) {
        userMapper.addMovieToList(movielist);
    }



}
