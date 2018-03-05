package com.liyashe.domain.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yfxx on 2018/3/4.
 */
public class FeedDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private int purchaseNumber;
    private String name;
    private int coin;
    private String publishTime;
    private int browseNumber;
    private String avatarUrl;
    private boolean hasAudio;
    private int audioDuration;
    private int totalMediaFileNumber;
    private Long userId;
    private String title;
    private String content;
    private List<MediaFileDto> visualFileList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(int purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public int getBrowseNumber() {
        return browseNumber;
    }

    public void setBrowseNumber(int browseNumber) {
        this.browseNumber = browseNumber;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public boolean isHasAudio() {
        return hasAudio;
    }

    public void setHasAudio(boolean hasAudio) {
        this.hasAudio = hasAudio;
    }

    public int getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(int audioDuration) {
        this.audioDuration = audioDuration;
    }

    public int getTotalMediaFileNumber() {
        return totalMediaFileNumber;
    }

    public void setTotalMediaFileNumber(int totalMediaFileNumber) {
        this.totalMediaFileNumber = totalMediaFileNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<MediaFileDto> getVisualFileList() {
        return visualFileList;
    }

    public void setVisualFileList(List<MediaFileDto> visualFileList) {
        this.visualFileList = visualFileList;
    }

}
