package com.demo.test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.Student;

@RestController
public class TestController {

    @GetMapping("hello")
    public Student sayHello(){

        Student s = new Student("小明","三年2班");

        return s;
    }
}
