package com.lt.bootdemo.service;

import com.lt.bootdemo.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService extends IService<User>{
//    User findByName(String name);
    User login(Map<String, Object> map);
}
