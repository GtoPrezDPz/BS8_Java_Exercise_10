package com.example.CustomAnswer.person.infraestructure.controller.dto.input;

import com.example.CustomAnswer.person.domain.Person;

import java.util.Objects;


public class PersonInputDto {

    Integer id_person;
    String user;
    String password;
    String name;
    String surname;
    String company_email;
    String personal_email;
    String population;
    Boolean active;
    String created_date;
    String imagen_url;
    String termination_date;

    public PersonInputDto(Integer id_person, String user, String password, String name, String surname, String company_email, String personal_email, String population, Boolean active, String created_date, String imagen_url, String termination_date) {
        this.id_person = id_person;
        this.user = user;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.company_email = company_email;
        this.personal_email = personal_email;
        this.population = population;
        this.active = active;
        this.created_date = created_date;
        this.imagen_url = imagen_url;
        this.termination_date = termination_date;
    }

    public PersonInputDto() {
    }

    public Integer getId_person() {
        return id_person;
    }

    public void setId_person(Integer id_person) {
        this.id_person = id_person;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany_email() {
        return company_email;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public String getPersonal_email() {
        return personal_email;
    }

    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }

    public String getTermination_date() {
        return termination_date;
    }

    public void setTermination_date(String termination_date) {
        this.termination_date = termination_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonInputDto that = (PersonInputDto) o;
        return Objects.equals(id_person, that.id_person) && Objects.equals(user, that.user) && Objects.equals(password, that.password) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(company_email, that.company_email) && Objects.equals(personal_email, that.personal_email) && Objects.equals(population, that.population) && Objects.equals(active, that.active) && Objects.equals(created_date, that.created_date) && Objects.equals(imagen_url, that.imagen_url) && Objects.equals(termination_date, that.termination_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_person, user, password, name, surname, company_email, personal_email, population, active, created_date, imagen_url, termination_date);
    }

    @Override
    public String toString() {
        return "PersonInputDto{" +
                "id_person=" + id_person +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company_email='" + company_email + '\'' +
                ", personal_email='" + personal_email + '\'' +
                ", population='" + population + '\'' +
                ", active=" + active +
                ", created_date='" + created_date + '\'' +
                ", imagen_url='" + imagen_url + '\'' +
                ", termination_date='" + termination_date + '\'' +
                '}';
    }

    public Person person(){
        Person person = new Person();
        person.setId_person(this.getId_person());
        person.setUser(this.getUser());
        person.setPassword(this.getPassword());
        person.setName(this.getName());
        person.setSurname(this.getSurname());
        person.setCompany_email(this.getCompany_email());
        person.setPersonal_email(this.getPersonal_email());
        person.setPopulation(this.getPopulation());
        person.setActive(this.getActive());
        person.setCreated_date(this.getCreated_date());
        person.setImagen_url(this.getImagen_url());
        person.setTermination_date(this.getTermination_date());
        return person;
    }

}
