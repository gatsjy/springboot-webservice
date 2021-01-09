package com.juan.book.springboot.web.dto;

import com.juan.book.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * @author Gatsjy
 * @since 2021-01-09
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}