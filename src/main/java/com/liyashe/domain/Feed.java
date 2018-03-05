package com.liyashe.domain;

import java.util.Date;
import java.util.List;

public class Feed {
    private Long feedId;

    private Long userId;

    private Integer purchaseNum;

    private Integer coinNum;

    private Date publishTime;

    private String title;

    private String content;

    private Integer browseNum;

    private Integer hasAudio;

    private String audioUrl;

    private Integer audioDuration;

    private Integer mediaFileNum;

    private Integer likeNum;

    private String tags;

    private Integer downloadSupport;

    private Integer status;

    private List<MediaFile> files;

    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public Integer getCoinNum() {
        return coinNum;
    }

    public void setCoinNum(Integer coinNum) {
        this.coinNum = coinNum;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getBrowseNum() {
        return browseNum;
    }

    public void setBrowseNum(Integer browseNum) {
        this.browseNum = browseNum;
    }

    public Integer getHasAudio() {
        return hasAudio;
    }

    public void setHasAudio(Integer hasAudio) {
        this.hasAudio = hasAudio;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl == null ? null : audioUrl.trim();
    }

    public Integer getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(Integer audioDuration) {
        this.audioDuration = audioDuration;
    }

    public Integer getMediaFileNum() {
        return mediaFileNum;
    }

    public void setMediaFileNum(Integer mediaFileNum) {
        this.mediaFileNum = mediaFileNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Integer getDownloadSupport() {
        return downloadSupport;
    }

    public void setDownloadSupport(Integer downloadSupport) {
        this.downloadSupport = downloadSupport;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<MediaFile> getFiles() {
        return files;
    }

    public void setFiles(List<MediaFile> files) {
        this.files = files;
    }
}