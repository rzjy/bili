package com.liyashe.dao;

import com.liyashe.domain.Feed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface FeedMapper {
    int deleteByPrimaryKey(Long feedId);

    int insert(Feed record);

    Feed selectByPrimaryKey(Long feedId);

    List<Feed> selectAll();

    int updateByPrimaryKey(Feed record);

    List<Feed> queryHottestFeeds();//获取最热的文件

    List<Feed> queryRecentFeeds();//获取最新的Feed

    List<Feed> queryFollowUsersFeeds(List<Long> userIds);

}