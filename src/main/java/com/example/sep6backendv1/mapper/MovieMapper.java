package com.example.sep6backendv1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sep6backendv1.model.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MovieMapper extends BaseMapper<Movie> {
    List<Movie> getMovie();

    Movie selectMovie(Integer id);

    List<Movie> selectMovieByYear(@Param("minYear") int minYear, @Param("maxYear") int maxYear);

    List<Movie> selectMoviesByTitle(String title);

    List<Movie> selectMoviesByDirector(Integer personId);

    List<Movie> selectMoviesByStar(Integer personId);

    int selectRatingById(Integer id);

    double selectVotesById(Integer id);

}
