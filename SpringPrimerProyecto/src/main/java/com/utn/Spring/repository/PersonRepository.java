package com.utn.Spring.repository;

import com.utn.Spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {


}
