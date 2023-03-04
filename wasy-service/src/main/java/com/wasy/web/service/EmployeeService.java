package com.wasy.web.service;

import com.wasy.web.mapper.EmployeeMapper;
import com.wasy.web.domain.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    public Employee getEmployeeById(Integer empId) {
        return employeeMapper.getEmployeeById(empId);
    }
}
