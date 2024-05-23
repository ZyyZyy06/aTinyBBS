/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2021 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package com.my.bbs.service;

import com.my.bbs.entity.BBSPostComment;
import com.my.bbs.entity.RecentCommentListEntity;
import com.my.bbs.util.PageQueryUtil;
import com.my.bbs.util.PageResult;

import java.util.List;

public interface BBSPostCommentService {


    Boolean addPostComment(BBSPostComment postComment);


    Boolean delPostComment(Long commentId, Long userId);


    PageResult getCommentsByPostId(Long postId, int commentPage);

    List<RecentCommentListEntity> getRecentCommentListByUserId(Long userId);
}
