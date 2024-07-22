package org.example.companymanagement.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long Id;
    private String name;
    private String surname;
    private String email;
    private int status;
    private LocalDate created_at;
    private LocalDate updated_at;
}
