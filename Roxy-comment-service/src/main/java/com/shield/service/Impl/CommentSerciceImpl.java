package com.shield.service.Impl;

import com.shield.dto.CommentInfoDto;
import com.shield.entity.CommentEntity;
import com.shield.mapper.CommentMapper;
import com.shield.service.ICommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 评论service
 */
@Service
public class CommentSerciceImpl implements ICommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public int addComment(CommentInfoDto dto){
        CommentEntity commentEntity = new CommentEntity();
        BeanUtils.copyProperties(dto,commentEntity);
        int count = commentMapper.addComment(commentEntity);
        return count;
    }
}
