package com.quester.smspsis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParentController {
    @GetMapping("/psis/h")
    String sayHello(){
        return "hello from psis";
    }
}
