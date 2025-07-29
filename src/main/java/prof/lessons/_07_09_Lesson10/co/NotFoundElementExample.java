package prof.lessons._07_09_Lesson10.co;

public class NotFoundElementExample {
    public static void main(String[] args) {
        ElementRepository repository = new ElementRepository();

        repository.addElement(new Person(1,"Red", ""));
        repository.addElement(new Person(5,"Tom", ""));
        repository.addElement(new Person(7,"Ann", ""));
        Integer idForSearch = 15;
        Person foundedPerson = repository.findById(idForSearch);
        System.out.println(foundedPerson.getName().length());
    }
}
