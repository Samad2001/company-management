package org.example.companymanagement.model.dto.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeWrapper {
    private String employeeId;
    private String name;
    private String surname;
    private String email;
    private int status;
    private LocalDateTime empCreatedAt;
    private LocalDateTime empUpdatedAt;
    /*position*/
    private Long positionId;
    private String positionName;
    private Long postionSalary;
    private LocalDate posCreatedAt;
    private LocalDate posUpdatedAt;
    //department
    private Long departmentId;
    private String departmentName;
    private LocalDate departmentCreated_at;
    private LocalDate departmentUpdated_at;
}
