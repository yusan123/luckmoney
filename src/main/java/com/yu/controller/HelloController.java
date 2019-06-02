package com.yu.controller;

import com.yu.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yousan on 2019/6/1 23:33.
 */
@RestController
public class HelloController {

    @Value("${yu.name}")
    private String name;

    @Autowired
    private LimitConfig config;

    @RequestMapping({"/hello"})
    public String hello(){
        return "hello" +name;
    }

    @GetMapping("/config")
    public String config(){
        return config.getInfo();
    }

    @GetMapping("/h1/{id}")
    public String h1(@PathVariable(value = "id",required = false) String id){
        return "id is " + id;
    }

    @GetMapping("/h2")
    public String h2(@RequestParam(value = "id",required = true,defaultValue = "9999") String id){
        return "id2 is" +id;
    }
}
