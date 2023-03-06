package com.wasy.web.service;

import com.wasy.web.common.result.Result;
import com.wasy.web.domain.Employee;
import com.wasy.web.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    public Result<Employee> getEmployeeById(Integer empId) {
        Employee employee = employeeMapper.getEmployeeById(empId);
        return Result.success(employee);
    }
}
