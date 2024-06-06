package com.ADSO.Project2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/")
    public String index(){
        return "pages/index";
    }

    @GetMapping("/registro")
    public String registro(){
        return "pages/registro";
    }

}