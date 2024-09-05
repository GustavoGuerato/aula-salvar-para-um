package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDto {
    private Long id;
    private String name;
    private Double salary;

    private DepartmentDto departmentDto;

    public PersonDepartmentDto(Long id, String name, Double salary, DepartmentDto departmentDto) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentDto = departmentDto;
    }

    public PersonDepartmentDto(Person entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.salary = entity.getSalary();
        this.departmentDto = new DepartmentDto(entity.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public DepartmentDto getDepartmentDto() {
        return departmentDto;
    }

}
