package prof.lessons._07_09_Lesson10.optionalDemo;

import java.util.Optional;

public class NotFoundElementExample {
    public static void main(String[] args) {
        ElementRepository repository = new ElementRepository();

        repository.addElement(new Person(1,"Red", ""));
        repository.addElement(new Person(5,"Tom", ""));
        repository.addElement(new Person(7,"Ann", ""));
        Integer idForSearch = 15;
        Optional<Person> foundedPersonOptional = repository.findById(idForSearch);
        if (foundedPersonOptional.isPresent()) {//true если внутри не пусто
            Person foundedPerson = foundedPersonOptional.get();// распаковывает
            System.out.println(foundedPerson.getName().length());
        }else {
            System.out.println("Пользователь с id = " + idForSearch + " не найден");
        }
    }
}
