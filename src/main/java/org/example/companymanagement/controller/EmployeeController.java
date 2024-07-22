package org.example.companymanagement.controller;

import lombok.RequiredArgsConstructor;
import org.example.companymanagement.mapper.EmployeeMapper;
import org.example.companymanagement.model.dto.request.EmployeeRequest;
import org.example.companymanagement.model.dto.response.EmployeeResponse;
import org.example.companymanagement.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


@GetMapping
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {
   List <EmployeeResponse> employeeResponse = employeeService.getAllEmployees();
    return ResponseEntity.ok(employeeResponse);
}

@GetMapping("/getby-id/{id}")
public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable("id") Long id) {
    EmployeeResponse employeeResponse = employeeService.getEmployeeById(id);
    return ResponseEntity.ok(employeeResponse);
}

@PostMapping
public ResponseEntity<Void> addEmployee(@RequestBody EmployeeRequest employeeRequest) {
    employeeService.addEmployee(employeeRequest);
    return ResponseEntity.ok().build();
}

@PutMapping("/id{id}")
public ResponseEntity<Void> updateEmployee(@PathVariable("id") Long id,
                                           @RequestBody EmployeeRequest employeeRequest) {
    employeeService.updateEmployee(id, employeeRequest);
    return ResponseEntity.ok().build();
}

@DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
    employeeService.deleteEmployee(id);
    return ResponseEntity.ok().build();
}

}
