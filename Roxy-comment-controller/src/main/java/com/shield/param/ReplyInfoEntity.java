package com.shield.param;

import lombok.Data;

/**
 * 回复信息
 */
@Data
public class ReplyInfoEntity {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 回复id
     */
    private String replyId;
    /**
     * 模块
     * 1：社区模块
     * 2：游戏模块
     * 3：短视频模块
     */
    private Integer module;
    /**
     * 用户名
     */
    private String username;
    /**
     * 内容
     */
    private String content;
    /**
     * 点赞数
     */
    private String starNum;
    /**
     * 回复时间
     * 格式：yyy-MM-dd HH:mm:ss
     */
    private String replyTime;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 被回复的名字
     */
    private String repliedName;
    /**
     * 被回复的id
     */
    private String repliedId;
    /**
     * 状态
     * 1：置顶
     * 0：取消置顶
     */
    private Integer status;
}
