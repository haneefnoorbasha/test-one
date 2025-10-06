package com.bny.se.gittest.dto;

public class EmployeeDto {
    private String name;
    private String department;
    private Long salary;

    public EmployeeDto() {
    }

    public EmployeeDto(String name, String department, Long salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
