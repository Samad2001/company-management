package org.example.companymanagement.service.lmpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.companymanagement.mapper.DepartmentMapper;
import org.example.companymanagement.model.dto.request.DepartmentRequest;
import org.example.companymanagement.model.dto.response.DepartmentResponse;
import org.example.companymanagement.model.entity.Department;
import org.example.companymanagement.repository.DepartmentRepository;
import org.example.companymanagement.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Slf4j
@Service
@RequiredArgsConstructor
public class DepartmentServicelmpl implements DepartmentService {

    private final DepartmentMapper departmentMapper;
    private final DepartmentRepository departmentRepository;

      /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = "16/08/2016";
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);*/

    @Override
    public List<DepartmentResponse> getAllDepartments() {
            List<Department> departments = departmentRepository.findAll();
        List<DepartmentResponse> responses = departmentMapper.toDepartmentResponses(departments);
        return responses;
    }

    @Override
    public DepartmentResponse getDepartmentById(Long departmentId) {
        Optional<Department> departmentOptional = departmentRepository.findById(departmentId);
        return departmentOptional
                .map(departmentMapper::toDepartmentResponse)
                .orElse(null);

    }

    @Override
    public void addDepartment(DepartmentRequest departmentRequest) {
    log.info("Add Department request received. DepartmentRequest: {}", departmentRequest);
    Department departments = departmentMapper.toDepartment(departmentRequest);

    log.info("DeparmentMapper mapped to Department.department:{}",departments);
    departmentRepository.insert(departments);
    log.info("Department added successfully.");
    log.warn("Warning{}", departmentRequest);

    log.error("error.{}", departmentRequest);
    }

    @Override
    public void updateDepartment(Long departmentId, DepartmentRequest departmentRequest) {
    Department department = departmentMapper.toDepartment(departmentId, departmentRequest);
    departmentRepository.update(department);
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
