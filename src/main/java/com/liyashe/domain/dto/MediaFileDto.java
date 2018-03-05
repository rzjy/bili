package com.liyashe.domain.dto;

import java.io.Serializable;

/**
 * Created by yfxx on 2018/3/4.
 */
public class MediaFileDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private int type;
    private boolean isBlur;
    private String thumbUrl;
    private String originUrl;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isBlur() {
        return isBlur;
    }

    public void setBlur(boolean blur) {
        isBlur = blur;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }
}
