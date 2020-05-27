package com.zhang.eblog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhang.eblog.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhang.eblog.vo.PostVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张
 * @since 2020-05-27
 */
public interface PostService extends IService<Post> {

    IPage<PostVo> paging(Page page, Long categoryId, Long userId, Integer level, Boolean recommend, String order);
}
