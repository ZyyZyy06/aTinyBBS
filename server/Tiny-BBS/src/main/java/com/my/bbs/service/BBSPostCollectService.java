
package com.my.bbs.service;

import com.my.bbs.entity.BBSPost;

import java.util.List;

public interface BBSPostCollectService {


    Boolean addCollectRecord(Long userId, Long postId);


    Boolean deleteCollectRecord(Long userId, Long postId);

    Boolean validUserCollect(Long userId, Long postId);

    List<BBSPost> getCollectRecordsByUserId(Long userId);
}
