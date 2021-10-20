package com.ddsof.jenkinsboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/display")
    public String index(){
        return "jenkins-2";
    }
}
