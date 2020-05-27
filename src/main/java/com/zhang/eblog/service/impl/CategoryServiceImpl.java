package com.zhang.eblog.service.impl;

import com.zhang.eblog.entity.Category;
import com.zhang.eblog.mapper.CategoryMapper;
import com.zhang.eblog.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
