package com.juan.book.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Gatsjy
 * @since 2021-01-10
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}
