package com.bny.se.gittest.service;

import com.bny.se.gittest.dto.EmployeeDto;
import com.bny.se.gittest.entity.EmployeeEntity;
import com.bny.se.gittest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity addEmployee(EmployeeDto employeeDto) {

        EmployeeEntity employee = new EmployeeEntity();
        employee.setName(employeeDto.getName());
        employee.setDepartment(employeeDto.getDepartment());
        employee.setSalary(employeeDto.getSalary());


        return employeeRepository.save(employee);

    }



}
