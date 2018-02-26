package com.liyashe.dao;

import com.liyashe.common.utils.MyMapper;
import com.liyashe.domain.LearnResource;

import java.util.List;
import java.util.Map;

public interface LearnResourceMapper extends MyMapper<LearnResource> {
    List<LearnResource> queryLearnResouceList(Map<String,Object> map);
}