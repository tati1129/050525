package _05_27_Lesson14.task6;

public class User {
    private String username;
    private String passord;
    private String email;
    private String description;

    public User(String username, String passord, String email, String description) {
        this.username = username;
        this.passord = passord;
        this.email = email;
        this.description = description;
    }

    public String getPassord() {
        return passord;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", passord='" + passord + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
