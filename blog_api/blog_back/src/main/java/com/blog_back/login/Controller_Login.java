package com.blog_back.login;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class Controller_Login
{
    private final Service_Login login;

    @GetMapping("/login")
    public Map<String, Object> loginService()
    {
        return login.getUserData();
    }
}
