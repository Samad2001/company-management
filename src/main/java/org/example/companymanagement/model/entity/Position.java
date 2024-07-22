package org.example.companymanagement.model.entity;


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
public class Position {

    private Long positionId;
    private String positionName;
    private int postionSalary;
    private LocalDate posCreatedAt;
    private LocalDate posUpdatedAt;
}
