package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


@RestController
public class MyGetMethod {
//@RequestMapping 详细用法：https://blog.csdn.net/zalan01408980/article/details/82904126
    @RequestMapping(value = "/useSpringBoot/getcookies",method = RequestMethod.GET)
    public String getCookie(){


        return "这是我的返回结果";
    }
    @RequestMapping("/user/show")

    public ModelAndView show(Long userId) {

// 创建 ModelAndView 对象，并设置视图名称

        ModelAndView mv = new ModelAndView("show");

// 添加模型数据

        mv.addObject("msg", "User ID：" + userId);

        return mv;

    }

/*    //模拟get请求返回cookie信息
    @RequestMapping(value = "/useSpringBoot/getcookies",method = RequestMethod.GET)
    public String getCookie(HttpServletResponse response){
        Cookie cookie=new Cookie("login","true");
        response.addCookie(cookie);
        return "这是我的get请求返回cookie的请求结果";
    }

    //模拟get请求携带cookie信息
    //HttpServletRequest类是一个存储器，可以把cookie等信息加入到请求中去访问get请求
    @RequestMapping(value = "/useSpringBoot/getwithCookies",method = RequestMethod.GET)
    public String getwithCookies(HttpServletRequest request){
        //从get请求携带的cookie中获取cookie，并赋值给cookies数组
        Cookie[] cookies = request.getCookies();

        //判断cookies数组是否为空，如果为空返回错误，不为空判断cookies是不是获取到的cookies
        if(Objects.isNull(cookies)){
            return "必须携带cookie信息";
        }
        //foreach循环cookies，对象类型是cookie类，利用cookie类的getName和getValue方法判断cookies信息
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("login") && cookie.getValue().equals("true")){
                return "这是一个携带cookie信息的get请求";
            }
        }
        return "cookies信息校验失败";

    }
    //模拟get请求携带参数
    @RequestMapping(value = "/useSpringBoot/getwithParam",method = RequestMethod.GET)
    public Map<String,String> getwithParam(@RequestParam("goodsid") String goodsid,
                                           @RequestParam("goodsdes") String goodsdes){

        Map<String,String> map=new HashMap<>();
        map.put("goodsid",goodsid);
        map.put("goodsdes",goodsdes);

        return map;

    }
    //模拟get请求携带参数 @PathVariable
    @RequestMapping(value = "/useSpringBoot/getwithParamtwo/{goodsid}/{goodsdes}",method = RequestMethod.GET)
    public Map<String,String> getwithParamtwo(@PathVariable("goodsid") String goodsid,
                                              @PathVariable("goodsdes") String goodsdes){
        Map<String,String> map=new HashMap<>();
        map.put("goodsid",goodsid);
        map.put("goodsdes",goodsdes);
        return map;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("contentType", "text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        String jsonstr = "[{\"name\": \"eco\", \"age\": \"21\"}]";
        out.print(jsonstr);
        out.flush();
        out.close();
    }
*/

}

