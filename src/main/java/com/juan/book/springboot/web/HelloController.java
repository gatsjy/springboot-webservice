package com.juan.book.springboot.web;

import com.juan.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gatsjy
 * @since 2020-12-07
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */

@RestController // 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줍니다.
public class HelloController {

    @GetMapping("/hello") // HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줍니다.
    public String hello() {
        return "hello";
    }

    // 외부에서 name이란 이름으로 넘긴 파라미터를 메소드 파라미터에 저장하게 됩니다.
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
