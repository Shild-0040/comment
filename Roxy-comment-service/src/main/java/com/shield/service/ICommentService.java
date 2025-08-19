package com.shield.service;

import com.shield.dto.CommentInfoDto;

public interface ICommentService {
    int addComment(CommentInfoDto dto);
}
