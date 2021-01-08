package com.java.example.controller;

import com.java.example.entity.Product;
import com.java.example.service.DemoService;
import com.java.example.service.ProductService;
import com.java.example.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class TestController {

    private final DemoService demoService;

    @Autowired
    private ProductService product;

    @Autowired
    public TestController(DemoService demoService) {
        this.demoService = demoService;

    }

    @GetMapping(value = "welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model){
        model.addAttribute("helloMessage",demoService.getHelloMessage(user));
        model.addAttribute("age",age);
        return ViewNames.WELCOME;
    }
    @RequestMapping(value = "home")
    public String home(){
        return "thymeleaf/home";
    }


    @RequestMapping(value="main")
    public String main(@RequestParam String first_name, @RequestParam String last_name, Model model){
        model.addAttribute("first_name",first_name);
        model.addAttribute("last_name",last_name);
        return ViewNames.MAIN;
    }

    @GetMapping(value="users")
    public String users(){
        return ViewNames.USERS;
    }

    @GetMapping(value = "test")
    public String test(){
        return ViewNames.TEST;
    }

    @PostMapping(value="lolzor")
    public String lolzor(String name,Model model){
        Product example = product.getProductByName(name);
        model.addAttribute("id",example.getId());
        model.addAttribute("name",example.getName());
        model.addAttribute("quanity",example.getQuanity());
        model.addAttribute("price",example.getPrice());
        model.addAttribute("count",product.getProductCount());
        return ViewNames.LOLZOR;
    }


}
