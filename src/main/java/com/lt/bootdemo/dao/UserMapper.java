package com.lt.bootdemo.dao;

import com.lt.bootdemo.domain.User;
import com.lt.bootdemo.tools.StringUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    @SelectProvider(type = LearnSqlBuilder.class, method = "queryUserByName")
    List<User> queryUserByName(String name, String password);

    class LearnSqlBuilder {
        public String queryUserByName(String name, String password) {
            StringBuffer sql = new StringBuffer();
            sql.append("select * from user where 1=1");
            if (!StringUtil.isNull(name) && !StringUtil.isNull(password)) {
                sql.append(" and username = '").append(name).append("'");
                sql.append(" and password = '").append(password).append("'");
            }

            System.out.println("查询sql==" + sql.toString());
            return sql.toString();
        }
    }
}
