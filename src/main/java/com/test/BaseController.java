package com.test;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BaseController {

    @RequestMapping("checkDeploy")
    @ResponseBody
    public Object checkDeploy(){
        return "success";
    }




}
