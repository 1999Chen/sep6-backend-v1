package com.example.sep6backendv1.Service.Impl;

import com.example.sep6backendv1.Service.IUserService;
import com.example.sep6backendv1.connection.MyBatisConnection;
import com.example.sep6backendv1.mapper.UserMapper;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.mapper.MovieMapper;
import com.example.sep6backendv1.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements IUserService {


    com.example.sep6backendv1.mapper.UserMapper UserMapper;

    public UserServiceImpl() throws ClassNotFoundException, SQLException {
        SqlSession ss = MyBatisConnection.getConnection();
        UserMapper = ss.getMapper(UserMapper.class);

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

        User User = UserMapper.selectUserByUsername(username);
        return  User;
    }





}
