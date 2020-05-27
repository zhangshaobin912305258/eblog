package com.zhang.eblog.service.impl;

import com.zhang.eblog.entity.Comment;
import com.zhang.eblog.mapper.CommentMapper;
import com.zhang.eblog.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张
 * @since 2020-05-27
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
