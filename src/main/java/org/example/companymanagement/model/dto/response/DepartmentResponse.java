package org.example.companymanagement.model.dto.response;

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
public class DepartmentResponse {

    private Long departmentId;
    private String departmentName;
    private LocalDate departmentCreated_at;
    private LocalDate departmentUpdated_at;
}
