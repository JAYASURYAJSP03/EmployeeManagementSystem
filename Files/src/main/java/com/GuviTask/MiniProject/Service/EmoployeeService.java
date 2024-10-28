package com.GuviTask.MiniProject.Service;

import com.GuviTask.MiniProject.Repository.EmployeeRepository;
import com.GuviTask.MiniProject.Dto.Employee;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmoployeeService {
    EmployeeRepository employeeRepository;
    ModelMapper modelMapper;
    public List<Employee> getAllEmployeeDetails() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeDetailsById(Long id) {
        return employeeRepository.findById(id).get();
    }

    public Employee addEmployeeDetails(Employee employeeDto) {
        Employee employee=modelMapper.map(employeeDto,Employee.class);
        return employeeRepository.save(employee);
    }

    public Employee updateEmployeeDetails(Employee employeeDto, Long id) {
//        System.out.println(id);
        Employee employee1=modelMapper.map(employeeDto,Employee.class);

        Employee employee2= employeeRepository.findById(id).get();

//        employeeRepository.deleteByEmployeeId(id);
//        employee2.setEmployeeId(employee1.getEmployeeId());
        employee2.setEmployeeEmail(employee1.getEmployeeEmail());
        employee2.setEmployeeLocation(employee1.getEmployeeLocation());
        employee2.setEmployeeFirstName(employee1.getEmployeeFirstName());
        employee2.setEmployeeLastName(employee1.getEmployeeLastName());

        employeeRepository.save(employee2);

        return modelMapper.map(employee2,Employee.class);
    }

    public void deleteEmployeeDetails(Long id) {
         employeeRepository.deleteById(id);

    }
}
