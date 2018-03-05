package com.liyashe.dao;

import com.liyashe.domain.MediaFile;
import java.util.List;

public interface MediaFileMapper {
    int deleteByPrimaryKey(Long fileId);

    int insert(MediaFile record);

    MediaFile selectByPrimaryKey(Long fileId);

    List<MediaFile> selectAll();

    int updateByPrimaryKey(MediaFile record);

    List<MediaFile> queryMediaFileByFeedId(Long feedId);

}