package com.chatus.domain;

import com.chatus.base.BaseEntity;

/**
 * 好友信息
 * Created by gaopan on 16/6/4.
 */
public class Friends extends BaseEntity {

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 朋友列表
     */
    private Integer friendId;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getFriendId() {
        return friendId;
    }

    public Friends() {}
}
