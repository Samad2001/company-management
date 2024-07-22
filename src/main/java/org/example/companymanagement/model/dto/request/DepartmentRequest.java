package org.example.companymanagement.model.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentRequest {
    private String departmentName;
    private LocalDate departmentCreated_at;
    private LocalDate departmentUpdated_at;
}
