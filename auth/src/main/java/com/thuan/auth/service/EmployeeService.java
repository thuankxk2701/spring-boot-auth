package com.thuan.auth.service;

import com.thuan.auth.api.response.LoginResponse;
import com.thuan.auth.model.dto.EmployeeDTO;
import com.thuan.auth.model.dto.LoginDTO;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginResponse loginEmployee(LoginDTO loginDTO);
}
