package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

import com.devsuperior.aula.dto.PersonDepartmentDto;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;

@Service
public class PersonService {

    public PersonDepartmentDto insert(PersonDepartmentDto dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = new Department();
        dept.setId(dto.getDepartmentDto().getId());

        entity.setDepartment(dept);

        return null;
    }
}
