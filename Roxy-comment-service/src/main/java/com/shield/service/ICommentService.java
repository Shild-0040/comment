package com.shield.service;

import com.shield.dto.CommentInfoDto;
import com.shield.dto.CommentResultInfoDto;

public interface ICommentService {

    int addComment(CommentInfoDto dto);

    int deleteComment(CommentInfoDto dto);

   CommentResultInfoDto queryCommentByParam(CommentInfoDto dto);
}
