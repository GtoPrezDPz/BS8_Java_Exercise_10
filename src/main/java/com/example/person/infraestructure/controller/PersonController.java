package com.example.CustomAnswer.person.infraestructure.controller;

import com.example.CustomAnswer.person.application.service.ServicePersonImpl;
import com.example.CustomAnswer.person.infraestructure.controller.dto.output.PersonOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PersonController {

    @Autowired
    private ServicePersonImpl ServicepersonImpl;

    @GetMapping("/getId/{id}")
    public PersonOutputDto getId(@PathVariable int id) throws Exception {
        return personServiceImpl.buscarPorId(id);
    }

    @GetMapping("/getUser/{user}")
    public List<PersonOutputDto> getUser(@PathVariable String user) {
        return ServicepersonImpl.buscarUsuario(user);
    }

}
