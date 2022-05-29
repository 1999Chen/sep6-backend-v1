package com.example.sep6backendv1.Service.Impl;

import com.example.sep6backendv1.Service.IPeopleService;
import com.example.sep6backendv1.connection.MyBatisConnection;
import com.example.sep6backendv1.mapper.MovieMapper;
import com.example.sep6backendv1.mapper.PeopleMapper;
import com.example.sep6backendv1.model.People;
import com.google.gson.Gson;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class PeopleServiceImpl implements IPeopleService {


    PeopleMapper peopleMapper;
    Gson gson;

    public PeopleServiceImpl()  {
        SqlSession ss = MyBatisConnection.getConnection();
        peopleMapper = ss.getMapper(PeopleMapper.class);
        gson=new Gson();
    }

    @Override
    public List<People> selectStarsByMovie(int movieId) {
        return peopleMapper.selectStarsByMovie(movieId);
    }


    @Override
    public List<People> selectDirectorsByMovie(int movieId) {
        return peopleMapper.selectDirectorsByMovie(movieId);
    }
}
