package com.liyashe.service.impl;

import com.github.pagehelper.PageHelper;
import com.liyashe.dao.AccountMapper;
import com.liyashe.dao.FeedMapper;
import com.liyashe.domain.Account;
import com.liyashe.domain.Feed;
import com.liyashe.domain.MediaFile;
import com.liyashe.domain.dto.FeedDto;
import com.liyashe.domain.dto.MediaFileDto;
import com.liyashe.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yfxx on 2018/2/28.
 */
@Service
public class FeedServiceImpl implements FeedService{

    @Autowired
    FeedMapper feedMapper;
    @Autowired
    AccountMapper accountMapper;

    @Override
    public List<FeedDto> getSquareFeedList(int start, int size, Long userId, int type) {
        //按照要求搜索Feed列表：不同type调用不同查询接口
        List<Feed> feeds = null;
        List<FeedDto> feedDtos = null;
        switch (type){
            case 1:feeds = this.queryRecentFeeds(start, size);break;
            case 2:feeds = this.queryHottestFeeds(start,size);break;
            case 3:
                if(userId != null){
                    feeds = this.queryFollowUsersFeeds(start,size,userId);
                }
                break;
            default:feeds = this.queryRecentFeeds(start, size);
        }
        //Feed列表转换为Map列表:
        // 1. 根据是否有userId判断所传用户是否购买过该Feed，如果是购买过则图片都是清晰的（后期可以将用户购买的feed列表放入Redis）
        // 2. 判断每一张图片是否为被模糊处理，模糊处理就传模糊的Url

        if(userId != null){
            for (Feed feed: feeds) {
                FeedDto feedDto = new FeedDto();
                Account account = accountMapper.selectByPrimaryKey(feed.getUserId());
                if (account != null) {
                    if (feed.getFiles() != null && feed.getFiles().size() != 0) {
                        List<MediaFileDto> mediaFileDtos = new ArrayList<>();
                        if (checkUserBuyFeed(userId, feed.getFeedId())) {
                            for (MediaFile mediaFile : feed.getFiles()) {
                                MediaFileDto mediaFileDto = new MediaFileDto();
                                mediaFileDto.setBlur(false);
                                mediaFileDto.setOriginUrl(mediaFile.getOriginUrl());
                                mediaFileDto.setThumbUrl(mediaFile.getThumbOriginUrl());
                                mediaFileDto.setType(mediaFile.getType());
                                mediaFileDtos.add(mediaFileDto);
                            }
                        } else {
                            for (MediaFile mediaFile : feed.getFiles()) {
                                MediaFileDto mediaFileDto = new MediaFileDto();
                                mediaFileDto.setBlur(mediaFile.getBlurred() == 1);
                                if (mediaFileDto.isBlur()) {
                                    mediaFileDto.setOriginUrl(mediaFile.getOriginUrl());
                                    mediaFileDto.setThumbUrl(mediaFile.getThumbOriginUrl());
                                } else {
                                    mediaFileDto.setOriginUrl(mediaFile.getBlurUrl());
                                    mediaFileDto.setThumbUrl(mediaFile.getThumbBlurUrl());
                                }
                                mediaFileDto.setType(mediaFile.getType());
                                mediaFileDtos.add(mediaFileDto);
                            }
                        }
                        feedDto.setVisualFileList(mediaFileDtos);
                    }
                    feedDto.setId(feed.getFeedId());
                    feedDto.setAudioDuration(feed.getAudioDuration());
                    feedDto.setAvatarUrl(account.getAvatarUrl());
                    //feedDto.

                    feedDtos.add(feedDto);
                }
            }
        }
        return feedDtos;
    }

    private boolean checkUserBuyFeed(Long userId,Long feedId){
        return false;
    }

    @Override
    public List<Feed> queryHottestFeeds(int start, int size) {
        PageHelper.startPage(start, size);
        return feedMapper.queryHottestFeeds();
    }

    @Override
    public List<Feed> queryRecentFeeds(int start, int size) {
        PageHelper.startPage(start, size);
        return feedMapper.queryRecentFeeds();
    }

    @Override
    public List<Feed> queryFollowUsersFeeds(int start, int size, Long userId) {
        PageHelper.startPage(start, size);
        return null;
    }
}
