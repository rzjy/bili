package com.liyashe.service;

import com.liyashe.domain.Feed;
import com.liyashe.domain.dto.FeedDto;

import java.util.List;
import java.util.Map;

/**
 * Created by yfxx on 2018/2/28.
 */
public interface FeedService {
    List<FeedDto> getSquareFeedList(int start, int size, Long userId, int type);

    List<Feed> queryHottestFeeds(int start,int size);

    List<Feed> queryRecentFeeds(int start, int size);

    List<Feed> queryFollowUsersFeeds(int start,int size, Long userId);
}
