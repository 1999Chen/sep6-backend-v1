package com.example.sep6backendv1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sep6backendv1.entity.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper extends BaseMapper<Movie> {
    List<Movie> getMovie();

    //    根据id
    Movie getMovieById(Integer id);

    //    增加用户
    int addMovie(Movie movie);

    //    修改用户信息
    int updateMovie(Movie movie);

    //    删除用户
    int deleteMovie(Integer id);
}
