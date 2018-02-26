package com.liyashe.domain;

import javax.persistence.*;

@Table(name = "media_file")
public class MediaFile {
    @Id
    @Column(name = "file_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fileId;

    @Column(name = "feed_id")
    private Long feedId;

    private String type;

    private Long size;

    /**
     * 是否模糊
     */
    private Integer blurred;

    @Column(name = "updateTime")
    private String updatetime;

    private Integer status;

    @Column(name = "thumb_origin_url")
    private String thumbOriginUrl;

    @Column(name = "origin_url")
    private String originUrl;

    @Column(name = "thumb_blur_url")
    private String thumbBlurUrl;

    @Column(name = "blur_url")
    private String blurUrl;

    /**
     * @return file_id
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

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
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return size
     */
    public Long getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * 获取是否模糊
     *
     * @return blurred - 是否模糊
     */
    public Integer getBlurred() {
        return blurred;
    }

    /**
     * 设置是否模糊
     *
     * @param blurred 是否模糊
     */
    public void setBlurred(Integer blurred) {
        this.blurred = blurred;
    }

    /**
     * @return updateTime
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
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

    /**
     * @return thumb_origin_url
     */
    public String getThumbOriginUrl() {
        return thumbOriginUrl;
    }

    /**
     * @param thumbOriginUrl
     */
    public void setThumbOriginUrl(String thumbOriginUrl) {
        this.thumbOriginUrl = thumbOriginUrl == null ? null : thumbOriginUrl.trim();
    }

    /**
     * @return origin_url
     */
    public String getOriginUrl() {
        return originUrl;
    }

    /**
     * @param originUrl
     */
    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl == null ? null : originUrl.trim();
    }

    /**
     * @return thumb_blur_url
     */
    public String getThumbBlurUrl() {
        return thumbBlurUrl;
    }

    /**
     * @param thumbBlurUrl
     */
    public void setThumbBlurUrl(String thumbBlurUrl) {
        this.thumbBlurUrl = thumbBlurUrl == null ? null : thumbBlurUrl.trim();
    }

    /**
     * @return blur_url
     */
    public String getBlurUrl() {
        return blurUrl;
    }

    /**
     * @param blurUrl
     */
    public void setBlurUrl(String blurUrl) {
        this.blurUrl = blurUrl == null ? null : blurUrl.trim();
    }
}