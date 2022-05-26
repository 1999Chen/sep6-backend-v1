package com.example.sep6backendv1.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sep6backendv1.Service.IMovieService;
import com.example.sep6backendv1.connection.MyBatisConnection;
import com.example.sep6backendv1.entity.Movie;
import com.example.sep6backendv1.mapper.MovieMapper;
//import com.mysql.cj.jdbc.Driver;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;


import javax.annotation.Resource;
import javax.annotation.Resources;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Service
public class MovieServiceImpl implements IMovieService {



    MovieMapper movieMapper;

    public MovieServiceImpl() throws ClassNotFoundException, SQLException {
        SqlSession ss = MyBatisConnection.getConnection();
        movieMapper = ss.getMapper(MovieMapper.class);

//        Class.forName("com.mysql.jdbc.Driver");
//
//        Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://35.204.25.150:3306/main_schema?sep6-350713:europe-west4:sep6sql",
//                "root",
//                "MTingCat819"
//        );
//
//        Statement st = conn.createStatement();
//        this.movieMapper = movieMapper;
    }

    @Override
    public Movie getMovieById(int id) {

        Movie movie = movieMapper.selectMovie(id);
        return  movie;
    }

    @Override
    public List<Movie> getListTestById(int minYear, int maxYear) throws SQLException, ClassNotFoundException {
//        Driver driver = new com.mysql.cj.jdbc.Driver();
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:mysql:///main_schema?cloudSqlInstance=sep6-350713:europe-west4:sep6sql&socketFactory=com.google.cloud.sql.mysql.SocketFactory&user=root&password=sep6");
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM movies WHERE year < "+year);
//        System.out.println("service ends "+year);
        List<Movie> list = new ArrayList<Movie>() ;
//        while (rs.next()) {
//            String title = rs.getString("title");
//            int movieYear = rs.getInt("year");
//            int movieId = rs.getInt("id");
//            Movie movie = new Movie(movieId,movieYear,title);
//            list.add(movie);
//        }
//        System.out.println(list.toArray());
        list = movieMapper.selectMovieByYear(minYear,maxYear);
        return list;
    }


    @Override
    public List<Movie> getAllMovies() throws ClassNotFoundException, SQLException {

//        Driver driver = new com.mysql.cj.jdbc.Driver();
//
//        System.out.println("service starts 1 "+id);
//        Class.forName("com.mysql.jdbc.Driver");
//        System.out.println("service starts 2 "+id);
//        Connection conn = DriverManager.getConnection("jdbc:mysql:///main_schema?cloudSqlInstance=sep6-350713:europe-west4:sep6sql&socketFactory=com.google.cloud.sql.mysql.SocketFactory&user=root&password=sep6");
//        System.out.println("service starts 3 "+id);
//        Statement stmt = conn.createStatement();
//        System.out.println("service starts 4 "+id);
//
//        ResultSet rs = stmt.executeQuery("SELECT * FROM movies WHERE ID = "+id);
//        System.out.println("service ends "+id);
//        Movie movie = new Movie();
//        while (rs.next()) {
//            String title = rs.getString("title");
//            int year = rs.getInt("year");
//            int movieId = rs.getInt("id");
//            movie.setTitle(title);
//            movie.setYear(year);
//            movie.setId(movieId);
//
//        }
//        System.out.println("title is "+movie.getTitle());



//        List<Movie>list = ss.selectList("selectAll");
        List<Movie>list = movieMapper.getMovie();
        return list;

//succeed
//        Movie movie = ss.selectOne("selectMovie",15414);
//
//        return movie.toString();



    }



}
