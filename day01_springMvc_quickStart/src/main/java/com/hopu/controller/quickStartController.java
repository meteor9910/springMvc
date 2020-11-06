package com.hopu.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.security.util.Password;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

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

        return "/WEB-INF/success.jsp";


    }

    @RequestMapping(value = "/hello",params = {"username=123","password=123"})
    public String demo2() {


        return "success";


    }
    @RequestMapping(value = "/demo3")
    public String demo3(User user){
        System.out.println("user=>"+user);
        return "success";
    }

    @RequestMapping(value ="/demo4")
    public String demo4(String[] students){
        for (String student:students){

            System.out.println(student);
        }
        return "success";

    }

    @RequestMapping(value = "/demo5")
        public String demo5(Vo vo){
            System.out.println(vo);
            return "success";

        }


        @RequestMapping(value = "/demo6")
    public String demo6(Date date){
            System.out.println(date);
            return "success";

        }


      @RequestMapping(value = "/demo77")
        public String demo77(HttpServletRequest request){
        request.setAttribute("user","admin");
        return "success";

        }

        @RequestMapping(value = "/demo88")
         public String demo8(Model model){
        model.addAttribute("users","admin");
        //mode底层的类似于一个Map机构，之间用键值对储存数据就可以了
        return  "success";

        }

        @RequestMapping(value = "/demo9")
        public ModelAndView demo9(ModelAndView modelAndView){
//        mode代表模型 就是数据，view代表视图，就是页面
        modelAndView.addObject("user","admin");
        modelAndView.setViewName("success");
        //设置视图，就相当于hello
            return modelAndView;
        }

        @RequestMapping("/demo10")
        public String demo10(Model model){
        model.addAttribute("name",12);
        return "forward:/WEB-INF/success.jsp";

        }

        @RequestMapping("/demo11")
    public void demo11(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
        request.setAttribute("name","13");
        request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request,response);



    }
    // 使用redirect关键字进行重定向，这种情况下视图解析器就失效了
    @RequestMapping("/demo12")
    public String demo12(Model model){
        model.addAttribute("name",16);
        return "redirect:/demo9";

    }
    // 使用原生的servlet的对象进行重定向，这种情况下视图解析器就失效了
    @RequestMapping("/demo13")
    public void demo13(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.setAttribute("name",17);
        response.sendRedirect(request.getContextPath()+"/demo3");

    }


    @RequestMapping("/demo14")
  @ResponseBody
    public String demo14(){
        return "success";

  }


    @RequestMapping("/demo15")
    @ResponseBody
    public User demo15(){
       User user = new User();
       user.setName("zhangyang");
       user.setAge(22);
       return user;

    }


    @RequestMapping("/demo16")
    @ResponseBody
    private Result demo16(){
        Result result = new Result();
        result.setCode(200);
        User user = new User();
        user.setName("tom");
        user.setAge(20);
        result.setMsg("查询正常");
        result.setData(user);
        return result;


    }

    @RequestMapping("/demo888")
    public ResponseEntity<Result> hello12(){
        Result result = new Result();
        result.setCode(200);
        User user = new User();
        user.setName("tom");
        user.setAge(20);
        result.setMsg("查询正常");
        result.setData(user);
        return new ResponseEntity<Result>(result, HttpStatus.CREATED);
    }















}
