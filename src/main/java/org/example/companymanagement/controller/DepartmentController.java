package org.example.companymanagement.controller;

import lombok.RequiredArgsConstructor;
import org.example.companymanagement.model.dto.request.DepartmentRequest;
import org.example.companymanagement.model.dto.response.DepartmentResponse;
import org.example.companymanagement.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity <List<DepartmentResponse>> getAll() {
        List<DepartmentResponse> departments = departmentService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }

    @GetMapping("/getby-id/{departmentId}")
    public ResponseEntity <DepartmentResponse> getDepartmentById(@PathVariable("departmentId") Long departmentId) {
        DepartmentResponse department= departmentService.getDepartmentById(departmentId);
        return ResponseEntity.ok(department);
    }

    @PostMapping
    public ResponseEntity <Void> addDepartment(@RequestBody DepartmentRequest departmentRequest) {
        departmentService.addDepartment(departmentRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{departmentId}")
    public ResponseEntity <Void> updateDepartment(@PathVariable Long departmentId,
                                                  @RequestBody DepartmentRequest departmentRequest) {
        departmentService.updateDepartment(departmentId, departmentRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{departmentId}")
    public ResponseEntity <Void> deleteDepartment(@PathVariable Long departmentId) {
        departmentService.deleteDepartment(departmentId);
        return ResponseEntity.ok().build();
    }



}
