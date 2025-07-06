package prof.lessons._06_30_Lesson6.compareObject.comparable;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person anothePerson) {
        int result = lastName.compareTo(anothePerson.lastName);
        if (result == 0) {
            result = firstName.compareTo(anothePerson.firstName);
        }
        return result;
    }
}
