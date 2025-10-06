package com.bny.se.gittest.controller;

import com.bny.se.gittest.dto.EmployeeDto;
import com.bny.se.gittest.entity.EmployeeEntity;
import com.bny.se.gittest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController
{
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
        @PostMapping
        public ResponseEntity<EmployeeEntity> addEmployee(@RequestBody EmployeeDto employeeDto) {
            EmployeeEntity savedEmployee = employeeService.addEmployee(employeeDto);
            return ResponseEntity.status(201).body(savedEmployee);
        }


    }

