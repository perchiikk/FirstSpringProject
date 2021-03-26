package springproject.service;

import springproject.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPeople();

    Person show(int id);

    void save(Person person);

    void update(int id, Person person);

    void delete(int id);
}
