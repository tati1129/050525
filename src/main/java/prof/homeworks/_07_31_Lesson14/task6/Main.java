package prof.homeworks._07_31_Lesson14.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
   Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их
 */
public class Main {
    public static void main(String[] args) {
        PersonService service = new PersonService();
        List<Person> filteredByAge = filteredByAge(service.persons, 25);
        List<Person> personsByUniqueSkills1 = findPersonWithUniqueSkills1(filteredByAge);
        List<Person> personsByUniqueSkills2 = findPersonWithUniqueSkills2(filteredByAge);
        System.out.println("Persons with unique skills, filtered and sorted by age");
        for (Person p : personsByUniqueSkills1) {
            System.out.println(p);
        }
        System.out.println("____________");
        for (Person p : personsByUniqueSkills2) {
            System.out.println(p);
        }
    }

    public static List<Person> filteredByAge(List<Person> persons, int age) {
        List<Person> filteredList = persons.stream()
                .filter(p -> p.getAge() >= age)
                .toList();
        return filteredList;

    }

    public static List<Person> findPersonWithUniqueSkills1(List<Person> persons) {
        List<Person> newList = new ArrayList<>();
        Set<String> uniqueSkills = persons.stream().
                flatMap(p -> p.getSkills().stream())
                .collect(Collectors.toSet());
        for (Person p : persons) {
            List<String> newSkills = new ArrayList<>();
            for (String str : p.getSkills()) {
                if (uniqueSkills.contains(str)) {
                    newSkills.add(str);
                    uniqueSkills.remove(str);
                }
            }
            Person newPerson = new Person(p.getName(), p.getAge(), newSkills);
            if (!newPerson.getSkills().isEmpty()) {
                newList.add(newPerson);
            }

        }
        return newList;
    }


    public static List<Person> findPersonWithUniqueSkills2(List<Person> persons) {
        List<Person> newList = new ArrayList<>();

        Map<String, Long> skillCount = persons.stream()
                .flatMap(p -> p.getSkills().stream())
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        for (Person p : persons) {
            List<String> newSkiils = p.getSkills().stream()
                    .filter(s -> skillCount.get(s) == 1)
                    .collect(Collectors.toList());

            Person newPerson = new Person(p.getName(), p.getAge(), newSkiils);
            if (!newPerson.getSkills().isEmpty()) {
                newList.add(newPerson);
            }

        }
        return newList;
    }
}

