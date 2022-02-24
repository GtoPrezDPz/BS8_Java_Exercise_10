package com.example.CustomAnswer.person.application.service;

import com.example.BS8RespuestasPersonalizadas.persona.application.mappers.DtoMapperPerson;
import com.example.BS8RespuestasPersonalizadas.persona.domain.Persona;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicePersonMapperImpl {

    @Autowired
    private RepositoryPerson Repositoryperson;

    @Autowired(required = false)
    private DtoMapperPerson dtoMapperPerson;

    public PersonOutputDto buscarPorId (int id){
        return dtoMapperPerson.personToPersonOutput(Repositoryperson.findById(id));
    }

    public List<PersonaOutputDto> buscarUsuario(String usuario){
        return Repositoryperson.findByUsuario(usuario)
                .stream()
                .map(i -> dtoMapperPerson.personToPersonOutput(new Persona()))
                .collect(Collectors.toList());
    }

}
