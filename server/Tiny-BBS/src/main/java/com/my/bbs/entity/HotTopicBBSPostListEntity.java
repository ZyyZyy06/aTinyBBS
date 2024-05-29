package com.my.bbs.entity;


public class HotTopicBBSPostListEntity {
    private Long postId;

    private String postTitle;

    private Long postComments;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public Long getPostComments() {
        return postComments;
    }

    public void setPostComments(Long postComments) {
        this.postComments = postComments;
    }

    @Override
    public String toString() {
        return "HotTopicBBSPostListEntity{" +
                "postId=" + postId +
                ", postTitle='" + postTitle + '\'' +
                ", postComments=" + postComments +
                '}';
    }
}