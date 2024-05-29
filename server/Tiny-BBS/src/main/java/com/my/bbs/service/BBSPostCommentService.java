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
