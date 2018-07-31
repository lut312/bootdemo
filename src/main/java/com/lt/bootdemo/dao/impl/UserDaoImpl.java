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

    @Override
    public User findByNameAndPassword(String name, String password) {
        StringBuffer sql =new StringBuffer();
        sql.append("select * from user where 1=1");
        sql.append(" and username = '" + name + "' and password = '" + password + "'");
        List<User> list = jdbcTemplate.query(sql.toString(),  new BeanPropertyRowMapper(User.class));
        if(null != list && list.size()>0){
            User user = list.get(0);
            return user;
        }else{
            return null;
        }
    }
}
