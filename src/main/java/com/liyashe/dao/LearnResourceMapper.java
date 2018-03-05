package com.liyashe.dao;

import com.liyashe.domain.LearnResource;
import java.util.List;
import java.util.Map;

public interface LearnResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LearnResource record);

    LearnResource selectByPrimaryKey(Long id);

    List<LearnResource> selectAll();

    int updateByPrimaryKey(LearnResource record);

    List<LearnResource> queryLearnResouceList(Map<String,Object> map);
}