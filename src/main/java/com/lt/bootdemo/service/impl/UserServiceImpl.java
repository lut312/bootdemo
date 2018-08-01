package com.lt.bootdemo.service.impl;

import com.lt.bootdemo.dao.UserDao;
import com.lt.bootdemo.dao.UserMapper;
import com.lt.bootdemo.domain.User;
import com.lt.bootdemo.service.BaseService;
import com.lt.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl extends BaseService<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login (Map<String, Object> map) {
        return userMapper.login(map);
    }
}
