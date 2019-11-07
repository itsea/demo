package com.example.controllers;

import com.example.pojos.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
@Controller
public class TryControllerf {

    User user=new User();
    @RequestMapping("/my")
    public ModelAndView test(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("modelandview");
        mv.addObject("name", "example");
        user.setSex("女");
        user.setUserName("wangwu");
        mv.addObject("user", user);

        //设置返回的数据为json类型，也可以不设置，返回对象
        mv.setView(new MappingJackson2JsonView());
        return mv;
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
