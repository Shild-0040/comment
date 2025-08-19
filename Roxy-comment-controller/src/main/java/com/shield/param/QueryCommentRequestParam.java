package com.shield.param;

import lombok.Data;

/**
 * 查询评论
 */
@Data
public class QueryCommentRequestParam {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 模块
     * 1：社区模块
     * 2：游戏模块
     * 3：短视频模块
     */
    private Integer module;
    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 评论ID
     */
    private String commentId;

    /**
     * 回复ID
     */
    private String replyId;

    /**
     * 回复数量
     */
    private Integer replyNum;
    /**
     * 热度分数
     */
    private Integer hotScore;
}
