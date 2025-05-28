package basic._05_22_Lesson12;

public class Student {
    private String lastName;
    private String firstName;
    private String idNumber;
    private String group;

    public Student(String lastName, String firstName, String idNumber, String group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.group = group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getGroup() {
        return group;
    }

    public void printStudentInfo(){
        System.out.println("Информация о студенте :");
        System.out.println("Фамилия : " + lastName + " , Имя : " + firstName);
        System.out.println("id номер : "+ idNumber);
        System.out.println("Группа : " + group);

    }
}
