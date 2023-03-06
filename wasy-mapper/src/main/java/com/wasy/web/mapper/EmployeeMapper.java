package com.wasy.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wasy.web.domain.Employee;

public interface EmployeeMapper extends BaseMapper<Employee> {
    Employee getEmployeeById(Integer id);

}