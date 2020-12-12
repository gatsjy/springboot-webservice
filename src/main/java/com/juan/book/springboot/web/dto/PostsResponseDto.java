package com.juan.book.springboot.web.dto;

import com.juan.book.springboot.domain.posts.Posts;
import lombok.Getter;

/**
 * @author Gatsjy
 * @since 2020-12-12
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

}
