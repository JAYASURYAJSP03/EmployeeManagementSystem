package com.GuviTask.MiniProject.Repository;

import com.GuviTask.MiniProject.Dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}
