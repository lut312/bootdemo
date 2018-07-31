package com.lt.bootdemo.service.impl;

import com.lt.bootdemo.dao.UserDao;
import com.lt.bootdemo.dao.UserMapper;
import com.lt.bootdemo.domain.User;
import com.lt.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findByNameAndPassword(String name, String password) {
        return this.userMapper.queryUserByName(name, password);
    }
}
