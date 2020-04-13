package com.utn.Spring.controller;

import com.utn.Spring.model.GetSalaryforStudentImp;
import com.utn.Spring.model.Person;
import com.utn.Spring.model.Student;
import com.utn.Spring.model.inter.IGetSalaryforStudent;
import com.utn.Spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController (final PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> getPerson(){

        return personService.getPerson();
    }

    @GetMapping("/{PersonId}")
    public
    Person getPersonById(@PathVariable Integer PersonId){

        //@RequestParam pasar un parametro ej: \?personaID=1
        //@PathVariable una variable como ruta ej: \persona\2

        return personService.getPersonById(PersonId);
    }

    @PostMapping("/")
    public void addPerson(@RequestBody @Valid final Person person){

       /* Student stu = new Student();
        stu.setIGetSalaryforStudent(new GetSalaryforStudentImp());

        //builder: patron que devuelve el mismo objeto
        //Person p= Person.builder().name("nombre").lastName("apellido").build();*/
        personService.addPerson(person);

    }

}
