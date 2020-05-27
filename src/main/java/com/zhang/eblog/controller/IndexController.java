package com.zhang.eblog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController{


    @RequestMapping({"", "/", "index"})
    public String index() {
        int pn = ServletRequestUtils.getIntParameter(request, "pn", 1);
        int size = ServletRequestUtils.getIntParameter(request, "size", 2);
        Page page = new Page(pn, size);
        //分页信息 分类信息 用户关联 置顶 精选  排序
        IPage results = postService.paging(page, null, null, null, null, "created");
        request.setAttribute("currentCategoryId", 0);
        request.setAttribute("pageData", results);
        return "index";
    }
}
