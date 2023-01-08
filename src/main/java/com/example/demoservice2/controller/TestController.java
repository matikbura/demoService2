package com.example.demoservice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

        @RequestMapping("test")
        public String test() {
            return "OKOKOKOKOKOKOKO";
        }
}
