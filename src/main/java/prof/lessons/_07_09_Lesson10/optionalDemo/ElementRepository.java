package prof.lessons._07_09_Lesson10.optionalDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ElementRepository {
    private List<Person> persons = new ArrayList<>();


    public void addElement(Person person){
        persons.add( person);
    }

    public Optional<Person> findById(Integer id){
        for (Person currentPerson : persons){
            if (currentPerson.getId() == id){
                return  Optional.of(currentPerson);
            }
        }
       return  Optional.empty();
    }
}
