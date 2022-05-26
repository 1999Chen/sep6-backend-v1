package com.example.sep6backendv1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sep6backendv1.model.Movie;
import com.example.sep6backendv1.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> getAllUsers();

    User selectUser(String name);



}
