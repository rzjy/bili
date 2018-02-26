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
public class LearnServiceImpl extends BaseService<LearnResource>  implements LearnService {

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
