package com.lt.bootdemo.dao.impl;

import com.lt.bootdemo.dao.UserDao;
import com.lt.bootdemo.domain.LearnResouce;
import com.lt.bootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User findByName(String name) {
        List<User> list = jdbcTemplate.query("select * from user where username = ?", new Object[]{name}, new BeanPropertyRowMapper(User.class));
        if(null != list && list.size()>0){
            User user = list.get(0);
            return user;
        }else{
            return null;
        }

    }
}
