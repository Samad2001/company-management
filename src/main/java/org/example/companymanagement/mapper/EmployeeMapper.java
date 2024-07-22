package org.example.companymanagement.mapper;


import org.example.companymanagement.model.dto.request.EmployeeRequest;
import org.example.companymanagement.model.dto.response.DepartmentResponse;
import org.example.companymanagement.model.dto.response.EmployeeResponse;
import org.example.companymanagement.model.entity.Department;
import org.example.companymanagement.model.entity.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeResponse toEmployeeResponse(Employee employee);
    List<EmployeeResponse> toEmployeeResponses(List <Employee> employees);
    Employee toEmployee(EmployeeRequest employeeRequest);
    Employee toEmployee(Long id, EmployeeRequest employeeRequest);

}
