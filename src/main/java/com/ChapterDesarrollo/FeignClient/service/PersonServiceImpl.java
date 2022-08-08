package com.ChapterDesarrollo.FeignClient.service;

import com.ChapterDesarrollo.FeignClient.client.PersonClient;
import com.ChapterDesarrollo.FeignClient.dto.person.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PersonService")
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonClient personClient;

    @Override
    public List<Person> getPersons() {
        return personClient.getPersonList();
    }

    @Override
    public Person getPerson(int id) {
        return personClient.getPerson(id);
    }

    @Override
    public Person createPerson(Person person) {
        return personClient.createPerson(person);
    }

    @Override
    public Person updateName(int id, String name) {
        var person = getPerson(id);
        person.setName(name);
        return personClient.updatePerson(id, person);
    }

    @Override
    public Person updateAvatar(int id, String avatar) {
        var person = getPerson(id);
        person.setAvatar(avatar);
        return personClient.updatePerson(id, person);
    }

    @Override
    public Person addCall(int id) {
        var person = getPerson(id);
        person.setCalls(person.getCalls() + 1);
        return personClient.updatePerson(id, person);
    }

    @Override
    public Person deletePerson(int id) {
        return personClient.deletePerson(id);
    }
}
