package uz.jasur.dao;

import org.springframework.stereotype.Component;
import uz.jasur.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT = 0;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Jasur"));
        people.add(new Person(++PEOPLE_COUNT, "Samir"));
        people.add(new Person(++PEOPLE_COUNT, "Naima"));
        people.add(new Person(++PEOPLE_COUNT, "Ulugbek"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        show(id).setName(updatedPerson.getName());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
