package org.example.companymanagement.model.entity;


import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    private Long departmentId;
    private String departmentName;
    private LocalDate departmentCreated_at;
    private LocalDate departmentUpdated_at;

}
