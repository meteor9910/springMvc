package com.hopu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@RequestMapping("/session")
@SessionAttributes("user")
public class SessionController {
@RequestMapping("/put")
    public String put(User user, Model model){
        System.out.println(user);
        user.setName("zhangsi");
        user.setAge(14);
        model.addAttribute("user",user);
        return "success";
    }

@RequestMapping("/clear")
public String put(SessionStatus sessionStatus){
    sessionStatus.setComplete();
    return "success";
}
}
