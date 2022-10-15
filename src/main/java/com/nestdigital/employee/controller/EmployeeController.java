package com.nestdigital.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to the home page";
    }
@GetMapping("/add")
    public String EmpolyeAdd(){
        return "Welcome to the employee add page";
    }
@GetMapping("/search")
    public String EmpolyeSearch(){
        return "Welcome to the employee search page";
    }
@GetMapping("/delete")
    public String EmpolyeDelete(){
        return "Welcome to the employee delete page";
    }
}
