package com.juan.book.springboot.config.auth;

import com.juan.book.springboot.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.userinfo.CustomUserTypesOAuth2UserService;

/**
 * @author Gatsjy
 * @since 2021-01-10
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */

@RequiredArgsConstructor
@EnableWebSecurity // Spring Security 설정들을 활성화 시켜줍니다.
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomUserTypesOAuth2UserService customUserTypesOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .headers().frameOptions().disable() // h2-console을 사용하기 위해 해당 옵션들을 disable합니다.
                .and()
                    .authorizeRequests() // URL별 권한 관리를 설정하는 옵션의 시작점입니다.
                    .antMatchers("/", "/css/**", "/images/**","/js/**","/h2-console/**").permitAll()
                    .antMatchers("/api/v1/**").hasRole(Role.USER.name()) // 권한 관리 대상을 지정하는 옵션입니다.
                    .anyRequest().authenticated()
                .and()
                    .logout()
                        .logoutSuccessUrl("/") // 로그아웃 기능에 대한 여러 설정의 진입점 입니다.
                .and()
                    .oauth2Login()
                        .userInfoEndpoint()
                            .userService(customUserTypesOAuth2UserService);
    }

}
