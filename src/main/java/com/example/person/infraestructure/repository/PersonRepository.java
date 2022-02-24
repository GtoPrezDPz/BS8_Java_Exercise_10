package com.example.person.infraestructure.repository;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface Repository Person extends JpaRepository<Person, Integer> {

    public Person findById(int id_person);

    @Query("select p from Persona p where p.usuario = ?1")
    public List<Person> findByUsuario(String user);

}
