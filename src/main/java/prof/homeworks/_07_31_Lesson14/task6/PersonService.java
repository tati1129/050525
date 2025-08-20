package prof.homeworks._07_31_Lesson14.task6;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    List<Person> persons = new ArrayList<>();

    Person person1 = new Person("Ann", 25);
    Person person2 = new Person("John", 26);
    Person person3 = new Person("Mary", 29);
    Person person4 = new Person("Linn", 21);
    Person person5 = new Person("Jack", 32);
    Person person6 = new Person("Tom", 34);
    Person person7 = new Person("Bill", 22);
    Person person8 = new Person("Ann", 27);
    Person person9 = new Person("Peter", 39);

    public PersonService() {
        person1.addSkill("Java");
        person1.addSkill("SQL");

        person2.addSkill("Python");
        person2.addSkill("Django");
        person2.addSkill("SQL");

        person3.addSkill("JavaScript");
        person3.addSkill("React");
        person3.addSkill("Django");

        person4.addSkill("C++");
        person4.addSkill("Algorithms");


        person5.addSkill("Management");
        person5.addSkill("Communication");
        person5.addSkill("Algorithms");

        person6.addSkill("Communication");
        person6.addSkill("Algorithms");
        person6.addSkill("SQL");

        person7.addSkill("SQL");
        person7.addSkill("Management");


        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);

    }
}
