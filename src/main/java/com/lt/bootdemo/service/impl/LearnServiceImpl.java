package com.lt.bootdemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.lt.bootdemo.dao.LearnResourceMapper;
import com.lt.bootdemo.domain.LeanQueryLeanListReq;
import com.lt.bootdemo.domain.LearnResource;
import com.lt.bootdemo.service.BaseService;
import com.lt.bootdemo.service.LearnService;
import com.lt.bootdemo.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LearnServiceImpl extends BaseService<LearnResource> implements LearnService {
    @Autowired
    private LearnResourceMapper learnResourceMapper;

    @Override
    public void deleteBatch(Long[] ids) {
        Arrays.stream(ids).forEach(id->learnResourceMapper.deleteByPrimaryKey(id));
    }

    @Override
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page) {
        PageHelper.startPage(page.getPage(), page.getRows());
        return learnResourceMapper.queryLearnResouceList(page.getCondition());
    }
}
