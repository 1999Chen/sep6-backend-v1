package com.example.sep6backendv1.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sep6backendv1.Service.IMovieService;
import com.example.sep6backendv1.entity.Movie;
import com.example.sep6backendv1.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;


import java.util.ArrayList;
import java.util.List;

public class MovieServiceImpl implements IMovieService {

    JdbcTemplate jdbcTemplate ;
    @Autowired
    MovieMapper movieMapper;

    @Override
    public List<Movie> getMovieById(String id) {
        QueryWrapper<Movie> queryWrapper = new QueryWrapper<Movie>();
//        queryWrapper.lambda().eq(true, Movie::getId, id);
        queryWrapper.lambda()
                .eq(StringUtils.isNotEmpty(id), Movie::getId, id)
        ;
        List<Movie> list = new ArrayList<>();
        list = movieMapper.selectList(queryWrapper);
        System.out.println("querywrapper创建完了");

  /*      Movie movie = new Movie();
          movie.setId(123);
          list.add(movie);
          System.out.println(list.get(0).toString());*/
        return list;
    }

    @Override
    public Movie getBy(String id){
        Movie movie = new Movie();
        movie.setId(123);

        return movie;
   /*     System.out.println("asdasdasdasd");
        return movieMapper.selectById(id);*/


    }



}
