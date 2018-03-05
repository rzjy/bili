package com.liyashe.domain;

public class MediaFile {
    private Long fileId;

    private Long feedId;

    private Integer type;

    private Long size;

    private Integer blurred;

    private String updatetime;

    private Integer status;

    private String thumbOriginUrl;

    private String originUrl;

    private String thumbBlurUrl;

    private String blurUrl;

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getBlurred() {
        return blurred;
    }

    public void setBlurred(Integer blurred) {
        this.blurred = blurred;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getThumbOriginUrl() {
        return thumbOriginUrl;
    }

    public void setThumbOriginUrl(String thumbOriginUrl) {
        this.thumbOriginUrl = thumbOriginUrl == null ? null : thumbOriginUrl.trim();
    }

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl == null ? null : originUrl.trim();
    }

    public String getThumbBlurUrl() {
        return thumbBlurUrl;
    }

    public void setThumbBlurUrl(String thumbBlurUrl) {
        this.thumbBlurUrl = thumbBlurUrl == null ? null : thumbBlurUrl.trim();
    }

    public String getBlurUrl() {
        return blurUrl;
    }

    public void setBlurUrl(String blurUrl) {
        this.blurUrl = blurUrl == null ? null : blurUrl.trim();
    }
}