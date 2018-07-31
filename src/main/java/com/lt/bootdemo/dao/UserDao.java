/*
package com.lt.bootdemo.dao;

import com.lt.bootdemo.domain.LearnResouce;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface UserDao {
    @Insert("insert into spuser(userid, username,usernickname) values(#{author},#{title},#{url})")
    int add(LearnResouce learnResouce);

    @Update("update spuser set userid=#{author},username=#{title},usernickname=#{url} where id = #{sysuserid}")
    int update(LearnResouce learnResouce);

    @DeleteProvider(type = LearnSqlBuilder.class, method = "deleteByids")
    int deleteByIds(@Param("ids") String[] ids);


    @Select("select * from spuser where sysuserid = #{id}")
    @Results(id = "learnMap", value = {
            @Result(column = "id", property = "id", javaType = Long.class),
            @Result(property = "author", column = "author", javaType = String.class),
            @Result(property = "title", column = "title", javaType = String.class)
    })
    LearnResouce queryLearnResouceById(@Param("id") Long id);

    @SelectProvider(type = LearnSqlBuilder.class, method = "queryLearnResouceByParams")
    List<LearnResouce> queryLearnResouceList(Map<String, Object> params);

    class LearnSqlBuilder {
        public String queryLearnResouceByParams(final Map<String, Object> params) {
            StringBuffer sql =new StringBuffer();
            sql.append("select * from spuser where 1=1");
            if(!StringUtil.isNull((String)params.get("username"))){
                sql.append(" and username like '%").append((String)params.get("user")).append("%'");
            }
            if(!StringUtil.isNull((String)params.get("usernickname"))){
                sql.append(" and usernickname like '%").append((String)params.get("usernickname")).append("%'");
            }
            System.out.println("查询sql=="+sql.toString());
            return sql.toString();
        }

        //删除的方法
        public String deleteByids(@Param("ids") final String[] ids){
            StringBuffer sql =new StringBuffer();
            sql.append("DELETE FROM spuser WHERE sysuserid in(");
            for (int i=0;i<ids.length;i++){
                if(i==ids.length-1){
                    sql.append(ids[i]);
                }else{
                    sql.append(ids[i]).append(",");
                }
            }
            sql.append(")");
            return sql.toString();
        }
    }
}
*/
