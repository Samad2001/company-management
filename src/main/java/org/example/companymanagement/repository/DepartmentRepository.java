package org.example.companymanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.companymanagement.model.entity.Department;

import java.util.List;
import java.util.Optional;

@Mapper
public interface DepartmentRepository {

    List<Department> findAll();
    Optional<Department> findById(@Param("departmentId") Long departmentId);
    void insert(Department department);
    void update(Department department);
    void deleteById(@Param("departmentId") Long departmentId);

}
