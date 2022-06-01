package com.example.sep6backendv1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {


    User selectUserByUsername(String username);

    User insertUser(String username, String password, String nickname);

    List<Movie> getMovieList(String username);

    void addMovieToList(String username,int id);



}
