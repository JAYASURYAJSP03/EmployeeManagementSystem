package com.GuviTask.MiniProject.Dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_details")
public class Employee {
    @Id
    private Long employeeId;
    private String employeeEmail;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeLocation;
}
