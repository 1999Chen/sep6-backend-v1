package com.example.sep6backendv1.Service.Impl;

import com.example.sep6backendv1.Service.IMovieService;
import com.example.sep6backendv1.connection.MyBatisConnection;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.mapper.MovieMapper;
//import com.mysql.cj.jdbc.Driver;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Service
public class MovieServiceImpl implements IMovieService {

    MovieMapper movieMapper;

    public MovieServiceImpl()  {
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
    public List<Movie> getMoviesByTitle(String title) {
        List<Movie>list  = movieMapper.selectMoviesByTitle("%"+title+"%");
        return list;
    }

    @Override
    public List<Movie> getListTestById(int minYear, int maxYear) throws SQLException, ClassNotFoundException {
        List<Movie> list = new ArrayList<Movie>() ;
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
