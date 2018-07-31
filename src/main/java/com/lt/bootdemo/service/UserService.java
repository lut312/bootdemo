package com.lt.bootdemo.service;

import com.lt.bootdemo.domain.User;

import java.util.List;

public interface UserService {
//    User findByName(String name);
List<User> findByNameAndPassword(String name, String password);
}
