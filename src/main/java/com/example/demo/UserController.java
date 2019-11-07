package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")


    String index() {
        return "Hello World! this is from /user/index";
    }
}

