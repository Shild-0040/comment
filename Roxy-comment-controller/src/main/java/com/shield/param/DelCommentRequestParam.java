package com.shield.param;

import lombok.Data;

import java.util.List;

/**
 * 删除评论
 */
@Data
public class DelCommentRequestParam {

    /**
     * 用户id
     */
    private String userId;
    /**
     * 评论id
     */
    private String commentId;
    /**
     * 模块
     */
    private Integer module;
    /**
     * 资源ID
     */
    private Long resourceId;

}
