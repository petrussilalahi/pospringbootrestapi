package com.juaracoding.controller;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author petrus a.k.a. Petrus
Java Developer
Created on 24/07/23 21.07
@Last Modified 24/07/23 21.07
Version 1.0
*/

import com.juaracoding.model.Xperson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
public class Xpersoncontroller {
    @GetMapping("/test")
    public String firstApi()
    {
        return "Hello World";
    }
}
