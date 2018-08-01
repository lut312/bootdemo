package com.lt.bootdemo.dao;

import com.lt.bootdemo.domain.LearnResource;
import com.lt.bootdemo.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface LearnResourceMapper extends MyMapper<LearnResource> {
    List<LearnResource> queryLearnResouceList(Map<String,Object> map);
}