package springproject.service;

import springproject.dao.PersonDaoImpl;
import springproject.models.Person;

import java.util.List;

public class PersonServiceImpl implements PersonService{
    private PersonDaoImpl personDAO = new PersonDaoImpl();

    @Override
    public List<Person> getAllPeople() {
        return personDAO.getAllPeople();
    }

    @Override
    public Person show(int id) {
        return personDAO.show(id);
    }

    @Override
    public void save(Person person) {
        personDAO.save(person);
    }

    @Override
    public void update(int id, Person person) {
        personDAO.update(id, person);
    }

    @Override
    public void delete(int id) {
        personDAO.delete(id);
    }
}
