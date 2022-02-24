package com.example.CustomAnswer.person.domain;

import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    Integer id_person;

    @NonNull
    @Column(name = "user")
    String user;

    @NonNull
    @Column(name = "password")
    String password;

    @NonNull
    @Column(name = "name")
    String name;

    @NonNull
    @Column(name = "surname")
    String surname;

    @NonNull
    @Column(name = "company_email")
    String company_email;

    @NonNull
    @Column(name = "personal_email")
    String personal_email;

    @NonNull
    @Column(name = "population")
    String population;

    @NonNull
    @Column(name = "active")
    Boolean active;

    @NonNull
    @Column(name = "created_date")
    String created_date;

    @NonNull
    @Column(name = "imagen_url")
    String imagen_url;

    @NonNull
    @Column(name = "termination_date")
    String termination_date;

    public Person(Integer id_person, @NonNull String user, @NonNull String password, @NonNull String name, @NonNull String surname, @NonNull String company_email, @NonNull String personal_email, @NonNull String population, @NonNull Boolean active, @NonNull String created_date, @NonNull String imagen_url, @NonNull String termination_date) {
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

    public Person() {
    }

    public Integer getId_person() {
        return id_person;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany_email() {
        return company_email;
    }

    public String getPersonal_email() {
        return personal_email;
    }

    public String getPopulation() {
        return population;
    }

    public Boolean getActive() {
        return active;
    }

    public String getCreated_date() {
        return created_date;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public String getTermination_date() {
        return termination_date;
    }

    public void setId_person(Integer id_person) {
        this.id_person = id_person;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }

    public void setTermination_date(String termination_date) {
        this.termination_date = termination_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.example.CustomAnswer.person.domain.Person persona = (com.example.CustomAnswer.person.domain.Person) o;
        return Objects.equals(id_person, persona.id_person) && user.equals(persona.user) && password.equals(persona.password) && name.equals(persona.name) && surname.equals(person.surname) && company_email.equals(person.company_email) && personal_email.equals(persona.personal_email) && population.equals(persona.population) && active.equals(persona.active) && created_date.equals(persona.created_date) && imagen_url.equals(persona.imagen_url) && termination_date.equals(persona.termination_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_person, user, password, name, surname, company_email, personal_email, population, active, created_date, imagen_url, termination_date);
    }

    @Override
    public String toString() {
        return "Person{" +
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
}
