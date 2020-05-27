package com.zhang.eblog.controller;

import com.zhang.eblog.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController extends BaseController {


    @GetMapping("/category/{id:\\d*}")
    public String category(@PathVariable Long id) {
        request.setAttribute("currentCategoryId", id);
        return "post/category";
    }

    @GetMapping("/detail/{id:\\d*}")
    public String detail(@PathVariable Long id) {
        Post post = postService.getById(id);
        request.setAttribute("currentCategoryId", post == null ? 0 : post.getCategoryId());
        return "post/detail";
    }
}
