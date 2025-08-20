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
     * 评分
     */
    private Integer Score;
    /**
     * 排序方式
     * 1：最新
     * 2：最热
     * 3：最早
     */
private Integer order;
    /**
     * 回复数量
     */
    private Integer replyNum;
    /**
     * 页码
     */
    private Integer pageNum;
    /**
     * 页大小
     */
    private Integer pageSize;
}
