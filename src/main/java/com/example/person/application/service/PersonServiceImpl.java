package com.example.CustomAnswer.person.application.service;

import com.example.BS8RespuestasPersonalizadas.persona.domain.Persona;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.input.PersonaInputDto;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl {


    @Autowired
    private PersonRepository personRepository;

    private PersonOutputDto converToDto(Person person){
        PersonOutputDto personOutputDto = new PersonOutputDto();

        personOutputDto.setId_person(person.getId_person());
        personOutputDto.setUser(person.getUser());
        personOutputDto.setPassword(person.getPassword());
        personOutputDto.setName(person.getName());
        personOutputDto.setSurname(person.getSurname());
        personOutputDto.setCompany_email(person.getCompany_email());
        personOutputDto.setPersonal_email(person.getPersonal_email());
        personOutputDto.setPopulation(person.getPopulation());
        personOutputDto.setActive(person.getActive());
        personOutputDto.setCreated_date(person.getCreated_date());
        personOutputDto.setImagen_url(person.getImagen_url());
        personOutputDto.setTermination_date(person.getTermination_date());

        return personOutputDto;
    }

    /*_____----- CRUD -----_____*/
    //vvvvvvvvvvvvvvvvvvvvvvvvvv//

    //Mostrar personas
    public List<PersonOutputDto> getAll(){
        return personRepository.findAll()
                .stream()
                .map(this::converToDto)
                .collect(Collectors.toList());
    }

    //Añadir personas
    public PersonOutputDto addPerson(PersonInputDto personInputDto) throws Exception {
        PersonOutputDto personOutputDto = new com.example.CustomAnswer.person.application.service.PersonServiceImpl().converToDto(personInputDto.person());
        if(personInputDto.person().getUser().length()>5){
            personRepository.save(personInputDto.person());
            return personOutputDto;
        }else {
            throw new Exception("Datos invalidos para añadir a esta persona");
        }
    }

    //Borrar personas
    public PersonOutputDto deletePerson(int id) throws Exception {
        PersonOutputDto personOutputDto = new com.example.CustomAnswer.person.application.service.PersonServiceImpl().converToDto(personRepository.findById(id));
        if(personRepository.findById(id) != null){
            personRepository.deleteById(id);
            return personOutputDto;
        }else{
            throw new Exception("No existe el usuario");
        }
    }

    //Modificar personas
    public PersonOutputDto modifyPerson(int id, PersonInputDto personInputDto){
        Person person = personRepository.findById(id);

        if (personInputDto.person().getUser() != null  && personInputDto.person().getName().length() >= 5){
            person.setUser(personInputDto.getUser());
        }
        if(personInputDto.person().getPassword() != null){
            person.setPassword(personInputDto.getPassword());
        }
        if(personInputDto.person().getName() != null){
            person.setName(personInputDto.getName());
        }
        if(personInputDto.person().getSurname() != null){
            person.setSurname(personInputDto.getSurname());
        }
        if(personInputDto.person().getCompany_email() != null){
            person.setCompany_email(personInputDto.getCompany_email());
        }
        if(personInputDto.person().getPersonal_email() != null){
            person.setPersonal_email(personInputDto.getPersonal_email());
        }
        if(personInputDto.person().getPopulation() != null){
            person.setPopulation(personInputDto.getPopulation());
        }
        if(personInputDto.person().getActive() != null){
            person.setActive(personInputDto.getActive());
        }
        if(personInputDto.person().getCreated_date() != null){
            person.setCreated_date(personInputDto.getCreated_date());
        }
        if(personInputDto.person().getImagen_url() != null){
            person.setImagen_url(personInputDto.getImagen_url());
        }
        if(personInputDto.person().getTermination_date() != null){
            person.setTermination_date(personInputDto.getTermination_date());
        }

        PersonaOutputDto personaOutputDto = new com.example.BS8RespuestasPersonalizadas.persona.application.service.PersonServiceImpl().converToDto(person);

        personRepository.save(person);

        return personOutputDto;
    }

    //^^^^^^^^^^^^^^^^^^^^^^^^^^//
    /*_____----- CRUD -----_____*/



    //Bucar por Id
    public PersonOutputDto buscarPorId (int id) throws Exception {
        PersonOutputDto personOutputDto = new com.example.CustomAnswer.person.application.service.PersonServiceImpl().converToDto(personRepository.findById(id));

        if (personOutputDto != null){
            return personOutputDto;
        }else {
            throw new Exception("No existe ningun usuario con ese ID");
        }
    }

    //Buscar por Usuario
    public List<PersonOutputDto> buscarUsuario(String user) {
        return personRepository.findByUsuario(user)
                .stream()
                .map(this::converToDto)
                .collect(Collectors.toList());
    }

}
