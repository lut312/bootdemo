package com.lt.bootdemo.service.impl;

import com.lt.bootdemo.dao.UserDao;
import com.lt.bootdemo.domain.User;
import com.lt.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public User findByNameAndPassword(String name, String password) {
        return userDao.findByNameAndPassword(name, password);
    }
}
