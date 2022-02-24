package com.example.CustomAnswer.person.infraestructure.controller;

import com.example.CustomAnswer.person.application.service.PersonServiceCrudMapperImpl;
import com.example.CustomAnswer.person.application.service.PersonServiceImpl;
import com.example.CustomAnswer.person.infraestructure.controller.dto.input.PersonInputDto;
import com.example.CustomAnswer.person.infraestructure.controller.dto.output.PersonOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PersonControllerCrud {

    @Autowired
    private PersonServiceImpl personServiceImpl;

    @GetMapping("/getAll")
    public List<PersonOutputDto> getAll(){
        return personServiceImpl.getAll();
    }

    @PostMapping("/add")
    public PersonOutputDto addPerson(@RequestBody PersonInputDto personInputDto) throws Exception {
        return personServiceImpl.addPerson(personInputDto);
    }

    @DeleteMapping("/delete/{id}")
    public PersonOutputDto deleteId(@PathVariable int id) throws Exception {
        return personServiceImpl.deletePerson(id);
    }

    @PutMapping("/mod/{id}")
    public PersonOutputDto updateId(@PathVariable int id, @RequestBody PersonInputDto personInputDto){
        return personServiceImpl.modifyPerson(id, personInputDto);
    }

}
