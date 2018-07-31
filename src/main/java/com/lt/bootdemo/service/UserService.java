package com.lt.bootdemo.service;

import com.lt.bootdemo.domain.User;

public interface UserService {
    User findByName(String name);
}
