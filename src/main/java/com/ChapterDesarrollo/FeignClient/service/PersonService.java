package com.ChapterDesarrollo.FeignClient.service;

import com.ChapterDesarrollo.FeignClient.dto.person.Person;

import java.util.List;

public interface PersonService {

    List<Person> getPersons();

    Person getPerson(int id);

    Person createPerson(Person person);

    Person updateName(int id, String name);

    Person updateAvatar(int id, String avatar);

    Person addCall(int id);

    Person deletePerson(int id);

}
