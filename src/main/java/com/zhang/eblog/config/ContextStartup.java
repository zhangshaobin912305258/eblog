package com.zhang.eblog.config;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zhang.eblog.entity.Category;
import com.zhang.eblog.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ContextStartup implements ApplicationRunner, ServletContextAware {

    private final CategoryService categoryService;
    private ServletContext servletContext;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Category::getStatus, 0);
        List<Category> categoryList = categoryService.list(queryWrapper);
        servletContext.setAttribute("categoryList", categoryList);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}
