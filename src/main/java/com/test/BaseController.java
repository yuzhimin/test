package com.test;


import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BaseController {

    @RequestMapping("checkDeploy")
    @ResponseBody
    public Object checkDeploy(){
        return "success";
    }

    @RequestMapping("api/githubWebhook")
    @ResponseBody
    public Object githubWebhook(@RequestBody JSONObject content){
        System.out.println(content);
        return "success";
    }

    @RequestMapping("api/githubWebhook1")
    @ResponseBody
    public Object githubWebhook1(String content){
        System.out.println(content);
        return "success";
    }

    @RequestMapping("api/githubWebhook2")
    @ResponseBody
    public Object githubWebhook2(){
        System.out.println("githubWebhook2");
        return "success";
    }


}
