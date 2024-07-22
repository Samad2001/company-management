package org.example.companymanagement.service;

import org.example.companymanagement.model.dto.request.EmployeeRequest;
import org.example.companymanagement.model.dto.response.EmployeeResponse;
import org.example.companymanagement.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponse> getAllEmployees();
    EmployeeResponse getEmployeeById(Long Id);
    void addEmployee(EmployeeRequest employeeRequest);
    void updateEmployee(Long Id, EmployeeRequest employeeRequest);
    void deleteEmployee(Long Id);
}
