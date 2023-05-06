package com.blog_back.login;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Service_Login
{
    private Map<String, Object> userData = new HashMap<>();

    public Map<String, Object> getUserData()
    {
        userData.put("id","chHan");
        return userData;
    }
}
