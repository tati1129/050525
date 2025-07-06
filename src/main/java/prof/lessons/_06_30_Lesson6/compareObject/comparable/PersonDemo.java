package prof.lessons._06_30_Lesson6.compareObject.comparable;

import java.util.Set;
import java.util.TreeSet;

public class PersonDemo {
    public static void main(String[] args) {

        Set<Person> ourTeam = new TreeSet<>();

        ourTeam.add(new Person("Alex", "King"));
        ourTeam.add(new Person("Boris", "Bekker"));
        ourTeam.add(new Person("Zigmund", "Freid"));
        ourTeam.add(new Person("Elena", "Trojan"));
        ourTeam.add(new Person("Jonh", "Watson"));
        ourTeam.add(new Person("Bill", "Gates"));
        ourTeam.add(new Person("Andrew", "Lloyd"));
        ourTeam.add(new Person("Jonhatan", "Watson"));
        ourTeam.add(new Person("Elena", "Trojan"));

        for (Person person : ourTeam) {
            System.out.println(person.getFirstName() + ", " + person.getLastName());
        }
    }
}
