package com.liyashe.service;

import com.liyashe.common.utils.Page;
import com.liyashe.domain.LeanQueryLeanListReq;
import com.liyashe.domain.LearnResource;

import java.util.List;

/**
 * Created by tengj on 2017/4/7.
 */

public interface LearnService {
    int deleteByPrimaryKey(Long id);

    int insert(LearnResource record);

    LearnResource selectByPrimaryKey(Long id);

    List<LearnResource> selectAll();

    int updateByPrimaryKey(LearnResource record);
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page);
    public void deleteBatch(Long[] ids);
}
