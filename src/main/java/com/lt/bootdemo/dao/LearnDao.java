package com.lt.bootdemo.dao;

import com.lt.bootdemo.domain.LearnResouce;
import com.lt.bootdemo.tools.Page;

import java.util.Map;

public interface LearnDao {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long id);
    Page queryLearnResouceList(Map<String,Object> params);

}
