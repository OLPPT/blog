package com.pro.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oule on 2018/4/11.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(Model model){
        model.addAttribute("name","Dear");
        return "hello";
    }
}
