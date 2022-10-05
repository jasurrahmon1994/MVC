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
}
