package com.mytests.thymeleaf.thymeleaflayoutdialect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/decorator")
public class MyControllerForDecoratorTests {

    @GetMapping("/test1")
    public String test1(ModelMap model) {
        return "decorator/test1";
    }

    @GetMapping("/test2")
    public String test2(ModelMap model) {
        return "decorator/test2";
    }

    @RequestMapping("/test3")
    public String test3(ModelMap model) {
        model.addAttribute("test3", "this is test3");
        return "decorator/test3";
    }
}
