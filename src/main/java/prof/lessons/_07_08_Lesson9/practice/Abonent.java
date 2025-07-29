package prof.lessons._07_08_Lesson9.practice;

import java.util.Objects;

public class Abonent implements Comparable<Abonent> {
    private String firstName;
    private String secondName;
    private String description;

    public Abonent(String firstName, String secondName, String description) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Abonent abonent)) return false;
        return Objects.equals(firstName, abonent.firstName) && Objects.equals(secondName, abonent.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    @Override
    public int compareTo(Abonent another) {
        int result = secondName.compareTo(another.secondName);
        if (result == 0) result = firstName.compareTo(another.firstName);
        return result;
    }
}
