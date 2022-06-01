package com.example.sep6backendv1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {


    User selectUserByUsername(String username);

    @Insert("insert into users (username,password,nickname) values(#{username},#{password},#{nickname})")
    @SelectKey(statement = "select last_insert_username()", keyProperty = "user.username", before = false, resultType = int.class)
    String insertAUser(User user);

    User insertUser(String username, String password, String nickname);

    List<Movie> getMovieList(String username);

    void addMovieToList(String username,int id);



}
