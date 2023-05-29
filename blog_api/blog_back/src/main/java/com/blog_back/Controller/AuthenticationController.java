package com.blog_back.Controller;

import com.blog_back.Entity.User;
import com.blog_back.Repository.UserRepository;
import org.hibernate.boot.model.source.internal.hbm.XmlElementMetadata;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AuthenticationController
{
    private final UserRepository userRepository;

    public AuthenticationController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

   // 1. 회원가입
    @GetMapping("/singup")
    public String showSigninPage()
    {
        return "signin.html";
    }

    public String signin(@RequestParam String username, @RequestParam String password)
    {
        User user = userRepository.findByUsername(username);

        if (user.getUsername().equals(username))
        {
            return "not Use";
        }
        else
        {
            User newUser = new User();

            newUser.setUsername(username);

            return "Use";
        }
    }

    // 2. 로그인
    @GetMapping("/login")
    public String showLoginPage()
    {
        return "login.html";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password)
    {
        User user = userRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password))
        {
            return "login success";
        }
        else
        {
            return "login false";
        }
    }


}
