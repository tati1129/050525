package prof.lessons._07_09_Lesson10.co;

import java.util.ArrayList;
import java.util.List;

public class ElementRepository {
    private List< Person> persons = new ArrayList<>();


    public void addElement(Person person){
        persons.add( person);
    }

    public Person findById(Integer id){
        for (Person currentPerson : persons){
            if (currentPerson.getId() == id){
                return  currentPerson;
            }
        }
       return  null;
    }
}
