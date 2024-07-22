package org.example.companymanagement.service.lmpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.companymanagement.mapper.EmployeeMapper;
import org.example.companymanagement.model.dto.request.EmployeeRequest;
import org.example.companymanagement.model.dto.response.EmployeeResponse;
import org.example.companymanagement.model.entity.Employee;
import org.example.companymanagement.model.entity.Position;
import org.example.companymanagement.repository.EmployeeRepository;
import org.example.companymanagement.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServicelmpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeResponse> getAllEmployees() {
        List<Employee> em = employeeRepository.findAll(); // Todo bos vermek olmur
        List<EmployeeResponse> employeeResponses = new ArrayList<>();
        EmployeeResponse response = new EmployeeResponse();
        response.setName("Murad");
        response.setSurname("Aliyev");
        response.setEmail("muradaliyev@gmail.com");
        response.setStatus(2);
        employeeResponses.add(response);

        return employeeResponses;
    }

    @Override
    public EmployeeResponse getEmployeeById(Long Id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(Id);

        return employeeOptional
                .map(employeeMapper::toEmployeeResponse)
                .orElse(null);
    }

    @Override
    public void addEmployee(EmployeeRequest employeeRequest) {
        log.info("addEmployee request received. EmployeeRequest: {}", employeeRequest);
        Employee employee = employeeMapper.toEmployee(employeeRequest);
        employeeRepository.insert(employee);
        log.info("Employee added successfully.");
    }

    @Override
    public void updateEmployee(Long Id, EmployeeRequest employeeRequest) {
    Employee employee = employeeRepository.findById(Id).get();
    employeeRepository.update(employee);
    }

    @Override
    public void deleteEmployee(Long Id) {
        employeeRepository.deleteById(Id);
    }
}
