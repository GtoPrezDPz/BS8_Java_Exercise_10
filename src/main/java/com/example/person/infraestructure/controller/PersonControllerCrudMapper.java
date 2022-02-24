package com.example.CustomAnswer.person.infraestructure.controller;

import com.example.CustomAnswer.person.application.service.PersonServiceCrudMapperImpl;
import com.example.CustomAnswer.person.infraestructure.controller.dto.input.PersonInputDto;
import com.example.CustomAnswer.person.infraestructure.controller.dto.output.PersonOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PersonControllerCrudMapper {

    @Autowired
    private PersonServiceCrudMapperImpl personServiceCrudMapper;

    @GetMapping("/getAll2")
    public List<PersonOutputDto> getAll(){return personServiceCrudMapper.getAll();}

    @PostMapping("/add2")
    public PersonOutputDto addPerson(@RequestBody PersonInputDto personInputDto) throws Exception {
        return personServiceCrudMapper.addPerson(personInputDto);
    }

    @DeleteMapping("/delete2/{id}")
    public PersonOutputDto deleteId(@PathVariable int id) throws Exception {
        return personServiceCrudMapper.deletePerson(id);
    }

    @PutMapping("/mod2/{id}")
    public PersonOutputDto updateId(@PathVariable int id, @RequestBody PersonInputDto personInputDto){
        return personServiceCrudMapper.modifyPerson(id, personInputDto);
    }

}
