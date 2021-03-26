package springproject.dao;

import org.springframework.stereotype.Component;
import springproject.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDaoImpl implements PersonDao {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Mark", 16, "mark@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Vitya", 22, "viktor@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Tanya", 18, "tusha@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Vlad", 25, "vlad@mail.ru"));
    }

    public List<Person> getAllPeople(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(s -> s.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person person){
        Person currentPerson = show(id);
        currentPerson.setName(person.getName());
        currentPerson.setAge(person.getAge());
        currentPerson.setEmail(person.getEmail());
    }

    public void delete(int id){
        people.removeIf(x -> x.getId() == id);
    }
}
