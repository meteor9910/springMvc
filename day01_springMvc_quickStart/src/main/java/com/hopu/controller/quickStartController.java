package com.hopu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//被组件器扫描，实例化为一个bean的组件
public class quickStartController {
    //匹配请求路径，进行匹配

    @RequestMapping("/springmvc/quickstart")
    public String quickStart() {
        System.out.println("接收到消息，请求处理");
        return "success";


    }
    @RequestMapping(value = "/hello/demo")
    public String demo(String name,int age) {
        System.out.println("name=>"+name);
        System.out.println("age=>"+age);

        return "success";


    }

    @RequestMapping(value = "/hello",params = {"username,password"})
    public String demo2() {


        return "success";


    }
    @RequestMapping(value = "/demo3")
    public String demo3(User user){
        System.out.println("user=>"+user);
        return "success";
    }


}
