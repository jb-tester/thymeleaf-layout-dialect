package com.mytests.thymeleaf.thymeleaflayoutdialect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/insert")
public class MyControllerForInsertTest {

    @GetMapping("/test1")
    public String test1() {
        return "insert/test1";
    }

    @GetMapping("/test2")
    public String test2(ModelMap model) {
        model.addAttribute("test2_attr1", "Test2:");
        model.addAttribute("test2_attr2", "the section is replaced with the parameterized template");
        return "insert/test2";
    }
}
