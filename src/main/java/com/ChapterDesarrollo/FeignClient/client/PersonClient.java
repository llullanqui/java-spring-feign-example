package com.ChapterDesarrollo.FeignClient.client;

import com.ChapterDesarrollo.FeignClient.dto.person.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "persons", url = "https://62ed4279a785760e67683488.mockapi.io/api/v2")
public interface PersonClient {

    @GetMapping(value = "/person")
    List<Person> getPersonList();

    @GetMapping(value = "/person/{id}")
    Person getPerson(@PathVariable("id") int id);

    @PostMapping(value = "/person")
    Person createPerson(Person person);

    @PutMapping(value = "/person/{id}")
    Person updatePerson(@PathVariable("id") int id, Person person);

    @DeleteMapping(value = "/person/{id}")
    Person deletePerson(@PathVariable("id") int id);

}
