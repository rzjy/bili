package com.liyashe.service.impl;


import com.github.pagehelper.PageHelper;
import com.liyashe.common.utils.Page;

import com.liyashe.dao.LearnResourceMapper;
import com.liyashe.domain.LeanQueryLeanListReq;
import com.liyashe.domain.LearnResource;
import com.liyashe.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tengj on 2017/4/7.
 */
@Service
public class LearnServiceImpl implements LearnService {

    @Autowired
    private LearnResourceMapper learnResourceMapper;

    @Override
    public void deleteBatch(Long[] ids) {
        Arrays.stream(ids).forEach(id->learnResourceMapper.deleteByPrimaryKey(id));
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return learnResourceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LearnResource record) {
        return learnResourceMapper.insert(record);
    }

    @Override
    public LearnResource selectByPrimaryKey(Long id) {
        return learnResourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LearnResource> selectAll() {
        return learnResourceMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(LearnResource record) {
        return learnResourceMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page) {
        PageHelper.startPage(page.getPage(), page.getRows());
        return learnResourceMapper.queryLearnResouceList(page.getCondition());
    }
}
