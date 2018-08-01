package com.lt.bootdemo.service;

import com.lt.bootdemo.domain.LeanQueryLeanListReq;
import com.lt.bootdemo.domain.LearnResource;
import com.lt.bootdemo.util.Page;

import java.util.List;

public interface LearnService extends IService<LearnResource>{
    List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page);
    void deleteBatch(Long[] ids);
}
