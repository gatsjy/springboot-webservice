package com.juan.book.springboot.config.auth.dto;

import com.juan.book.springboot.domain.user.User;

import java.io.Serializable;

/**
 * @author Gatsjy
 * @since 2021-01-11
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
