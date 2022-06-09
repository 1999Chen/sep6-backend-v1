package com.example.sep6backendv1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.model.Movielist;
import com.example.sep6backendv1.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {


    User selectUserByUsername(String username);

    @Insert("insert into newUsers (username,password,nickname) values(#{username},#{password},#{nickname})")
    void insertAUser(User user);

//    User insertUser(String username, String password, String nickname);

    List<Movie> getMovieList(String username);

    @Insert("insert into movielist (username,movie_id) values(#{username},#{id})")
    void addMovieToList(Movielist movielist);



}
