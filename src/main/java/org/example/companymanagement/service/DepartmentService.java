package org.example.companymanagement.service;

import org.example.companymanagement.model.dto.request.DepartmentRequest;
import org.example.companymanagement.model.dto.response.DepartmentResponse;
import org.example.companymanagement.model.entity.Department;

import java.util.List;

public interface DepartmentService {

    List<DepartmentResponse> getAllDepartments();
    DepartmentResponse getDepartmentById(Long departmentId);
    void addDepartment(DepartmentRequest departmentRequest);
    void updateDepartment(Long departmentId, DepartmentRequest departmentRequest);
    void deleteDepartment(Long departmentId);
}
