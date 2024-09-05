package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.aula.dto.PersonDepartmentDto;
import com.devsuperior.aula.entities.Person;

@Service
public class PersonService {

    public PersonDepartmentDto insert(PersonDepartmentDto dto) {
        Person entity = new Person();
    }
}
