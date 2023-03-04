package com.wasy.web.controller;

import com.wasy.web.domain.Employee;
import com.wasy.web.service.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/sql")
    public Employee hello() {
        return employeeService.getEmployeeById(1);
    }
}
