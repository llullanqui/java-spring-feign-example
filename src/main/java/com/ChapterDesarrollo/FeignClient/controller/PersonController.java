package com.ChapterDesarrollo.FeignClient.controller;

import com.ChapterDesarrollo.FeignClient.dto.person.Person;
import com.ChapterDesarrollo.FeignClient.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class PersonController {

    @Autowired
    @Qualifier("PersonService")
    private PersonService personService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Person>> getPersons(@RequestParam(defaultValue = "1") int page) {
        return new ResponseEntity<>(personService.getPersons(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Person> getPerson(@PathVariable int id) {
        return new ResponseEntity<>(personService.getPerson(id), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return new ResponseEntity<>(personService.createPerson(person), HttpStatus.OK);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Person> addCall(@PathVariable int id) {
        return new ResponseEntity<>(personService.addCall(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Person> deletePerson(@PathVariable int id) {
        return new ResponseEntity<>(personService.deletePerson(id), HttpStatus.OK);
    }

}
