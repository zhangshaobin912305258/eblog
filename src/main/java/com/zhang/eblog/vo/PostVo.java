package com.zhang.eblog.vo;

import com.zhang.eblog.entity.Post;
import lombok.Data;

@Data
public class PostVo extends Post {
    private Long authorId;
    private String authorName;
    private String authorAvatar;
    private String categoryName;

}
