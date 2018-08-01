package com.lt.bootdemo.dao;

import com.lt.bootdemo.domain.User;
import com.lt.bootdemo.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface UserMapper extends MyMapper<User> {
    User login(Map<String,Object> map);
}