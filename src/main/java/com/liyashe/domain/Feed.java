package com.liyashe.domain;

import javax.persistence.*;

@Table(name = "feed")
public class Feed {
    @Id
    @Column(name = "feed_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "purchase_num")
    private Integer purchaseNum;

    @Column(name = "coin_num")
    private Integer coinNum;

    @Column(name = "publish_time")
    private String publishTime;

    private String description;

    @Column(name = "browse_num")
    private Integer browseNum;

    @Column(name = "has_audio")
    private Integer hasAudio;

    @Column(name = "audio_url")
    private String audioUrl;

    @Column(name = "audio_duration")
    private String audioDuration;

    @Column(name = "media_file_num")
    private Integer mediaFileNum;

    @Column(name = "like_num")
    private Integer likeNum;

    private String tags;

    @Column(name = "download_support")
    private Integer downloadSupport;

    private Integer status;

    /**
     * @return feed_id
     */
    public Long getFeedId() {
        return feedId;
    }

    /**
     * @param feedId
     */
    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return purchase_num
     */
    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    /**
     * @param purchaseNum
     */
    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    /**
     * @return coin_num
     */
    public Integer getCoinNum() {
        return coinNum;
    }

    /**
     * @param coinNum
     */
    public void setCoinNum(Integer coinNum) {
        this.coinNum = coinNum;
    }

    /**
     * @return publish_time
     */
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * @param publishTime
     */
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return browse_num
     */
    public Integer getBrowseNum() {
        return browseNum;
    }

    /**
     * @param browseNum
     */
    public void setBrowseNum(Integer browseNum) {
        this.browseNum = browseNum;
    }

    /**
     * @return has_audio
     */
    public Integer getHasAudio() {
        return hasAudio;
    }

    /**
     * @param hasAudio
     */
    public void setHasAudio(Integer hasAudio) {
        this.hasAudio = hasAudio;
    }

    /**
     * @return audio_url
     */
    public String getAudioUrl() {
        return audioUrl;
    }

    /**
     * @param audioUrl
     */
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl == null ? null : audioUrl.trim();
    }

    /**
     * @return audio_duration
     */
    public String getAudioDuration() {
        return audioDuration;
    }

    /**
     * @param audioDuration
     */
    public void setAudioDuration(String audioDuration) {
        this.audioDuration = audioDuration == null ? null : audioDuration.trim();
    }

    /**
     * @return media_file_num
     */
    public Integer getMediaFileNum() {
        return mediaFileNum;
    }

    /**
     * @param mediaFileNum
     */
    public void setMediaFileNum(Integer mediaFileNum) {
        this.mediaFileNum = mediaFileNum;
    }

    /**
     * @return like_num
     */
    public Integer getLikeNum() {
        return likeNum;
    }

    /**
     * @param likeNum
     */
    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * @return download_support
     */
    public Integer getDownloadSupport() {
        return downloadSupport;
    }

    /**
     * @param downloadSupport
     */
    public void setDownloadSupport(Integer downloadSupport) {
        this.downloadSupport = downloadSupport;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}