package prof.homeworks._07_31_Lesson14.task8;

import prof.homeworks._07_31_Lesson14.task8.entity.Person;
import prof.homeworks._07_31_Lesson14.task8.repository.PersonsRepository;
import prof.homeworks._07_31_Lesson14.task8.service.Service;

import java.util.List;

/*
Дан список объектов Person, содержащий информацию о людях, включая имя, возраст, пол и зарплату.
Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.
 */
public class Main {
    public static void main(String[] args) {
        PersonsRepository repository = new PersonsRepository();
        Service service = new Service();
        System.out.println("Всего людей в списке: " + repository.findAll().size());
//        List<Person> people = service.findAll();
        List<Person> people = service.getByGenderAndAge("male", 25,40);

        for (Person p:people){
            System.out.println(p);
        }

        System.out.println(service.getSalaryAVGByGenderAndAge("male", 25, 40));
    }
}
