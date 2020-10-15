package com.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BaseController {

    @RequestMapping("checkDeploy")
    public Object checkDeploy(){
        return "success";
    }

    @RequestMapping("test")
    public Object test(){
        System.out.println(System.currentTimeMillis());
        return "success";
    }

    @RequestMapping("test1")
    public Object test1(String name, Integer age){
        System.out.println(name);
        System.out.println(age);
        return "test1";
    }

    @RequestMapping(value="test2", method = RequestMethod.POST)
    public Object test2(String name, Integer age){
        System.out.println(name);
        System.out.println(age);
        return "test2";
    }

}
