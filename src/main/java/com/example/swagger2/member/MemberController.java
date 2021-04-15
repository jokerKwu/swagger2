package com.example.swagger2.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class MemberController{

    @GetMapping("user/search")
    public Map<String, String> search(){
        Map<String, String> response = new HashMap<String, String>();
        response.put("name","taehong.kim");
        response.put("age","28");
        response.put("email","xxxxxx@gmail.com");
        return response;
    }
}
