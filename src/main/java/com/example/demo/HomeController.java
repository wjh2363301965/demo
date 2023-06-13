package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther:剑豪
 * @Date:2023/6/13
 * @VERSON:1.8
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }


}
