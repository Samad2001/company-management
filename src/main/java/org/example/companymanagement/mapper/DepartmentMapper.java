package org.example.companymanagement.mapper;

import org.example.companymanagement.model.dto.request.DepartmentRequest;
import org.example.companymanagement.model.dto.response.DepartmentResponse;
import org.example.companymanagement.model.entity.Department;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    List<DepartmentResponse> toDepartmentResponses(List<Department> departments);


    DepartmentResponse toDepartmentResponse(Department department);

    Department toDepartment(DepartmentRequest departmentRequest);

    Department toDepartment(Long departmentId,DepartmentRequest departmentRequest);

}
