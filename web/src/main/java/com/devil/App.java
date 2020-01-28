package com.devil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class App {

    @Autowired
    private HelloServie helloServie;

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return helloServie.print();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
