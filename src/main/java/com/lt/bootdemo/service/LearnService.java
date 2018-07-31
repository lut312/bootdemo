package com.lt.bootdemo.service;

import com.lt.bootdemo.domain.LearnResouce;
import com.lt.bootdemo.tools.Page;

import java.util.Map;

public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    Page queryLearnResouceList(Map<String,Object> params);
}
