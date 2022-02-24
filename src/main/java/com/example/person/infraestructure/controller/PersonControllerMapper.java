package com.example.person.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PersonControllerMapper {

    @Autowired
    private com.example.CustomAnswer.person.application.service.ServicePersonMapperImpl servicePersonMapper;

    @GetMapping("/getId2/{id}")
    public OutputDtoPerson getId(@PathVariable int id) throws Exception {
        return PersonserviceMapper.buscarPorId(id);
    }

    @GetMapping("/getUser2/{user}")
    public List<PersonOutputDto> getUser(@PathVariable String user) {
        return personServiceMapper.buscarUsuario(user);
    }


}
