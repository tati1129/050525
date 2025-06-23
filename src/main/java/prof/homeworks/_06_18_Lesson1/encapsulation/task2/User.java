package prof.homeworks._06_18_Lesson1.encapsulation.task2;

public class User {
    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }


    void changePassword(String password){
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
