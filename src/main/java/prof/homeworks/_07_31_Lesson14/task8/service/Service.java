package prof.homeworks._07_31_Lesson14.task8.service;

import prof.homeworks._07_31_Lesson14.task8.entity.Person;
import prof.homeworks._07_31_Lesson14.task8.repository.PersonsRepository;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private PersonsRepository repository;
    private final String path = "src/main/java/prof/homeworks/_07_31_Lesson14/task8/source/dataEmployees.csv";

    public Service() {
        this.repository = new PersonsRepository();
        repository.loadFromFile(path);
    }
    public List<Person> finfAll(){
       return repository.findAll();
    }

    public List<Person> getByGenderAndAge(String gender, int agefrom, int ageTo){
       return finfAll().stream()
                .filter(p -> p.getGender().equalsIgnoreCase(gender))
                .filter(p -> p.getAge() >= agefrom && p.getAge() < ageTo)
                .collect(Collectors.toList()
                );
    }

    public double  getSalaryAVGByGenderAndAge(String gender, int agefrom, int ageTo) {
        return finfAll().stream()
                .filter(p -> p.getGender().equalsIgnoreCase(gender))
                .filter(p -> p.getAge() >= agefrom && p.getAge() < ageTo)
                .mapToDouble(p -> p.getSalary())
                .average()
                .orElse(0);
    }

}
