package basic._05_14_Lesson7.task1;

public class User {
    private String name;
    private String email;
    private String adress;
    private String password;
    private String department;

    public User(String name, String email, String adress, String password, String department) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.password = password;
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", department='" + department + '\'' +
                '}';
    }


}
