package org.example.companymanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.companymanagement.model.entity.Employee;

import java.util.List;
import java.util.Optional;

@Mapper
public interface EmployeeRepository {

        List<Employee> findAll();
        Optional<Employee> findById(@Param("Id") Long Id);
        void insert(Employee employee);
        void update(Employee employee);
        void deleteById(@Param("Id") Long Id);

}
