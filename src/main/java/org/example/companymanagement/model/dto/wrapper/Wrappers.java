package org.example.companymanagement.model.dto.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Wrappers {
    private Long positionId;
    private String positionName;
    private int postionSalary;
    private LocalDate posCreatedAt;
    private LocalDate posUpdatedAt;

    private Long departmentId;
    private String departmentName;
    private LocalDate departmentCreated_at;
    private LocalDate departmentUpdated_at;

}
