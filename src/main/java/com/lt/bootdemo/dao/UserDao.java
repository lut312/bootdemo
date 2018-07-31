package com.lt.bootdemo.dao;

import com.lt.bootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserDao {
   User findByName(String name);
   User findByNameAndPassword(String name, String password);
}
