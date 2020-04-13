package com.utn.Spring.service;

import com.utn.Spring.model.Person;
import com.utn.Spring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import javax.xml.ws.http.HTTPException;
import java.util.List;

@Service
public
class PersonService {

    private
    PersonRepository personRepository;

    @Autowired
    public PersonService (PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public
    List<Person> getPerson(){

        return personRepository.findAll();
    }

    public
    void addPerson (Person person) {
        personRepository.save(person);
    }

    public
    Person getPersonById (Integer id) {

       return personRepository.findById(id).get();

    }
}
