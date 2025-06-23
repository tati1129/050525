package prof.homeworks._06_18_Lesson1.encapsulation.task2;

public class UserService {
    private User user;
    private Validation validation;


    public UserService(User user, Validation validation) {
        this.user = user;
        this.validation = validation;
    }


    public void changePassword(String oldPassword, String newPassword) {
        if (!user.checkPassword(oldPassword)) {
            System.out.println("Old password is incorrect!");
            return;
        }

        if (!validation.isValidPassword(newPassword)) {
            System.out.println("New password is not secure enough!");
            System.out.println("It must contain at least:");
            System.out.println("- 8 characters");
            System.out.println("- 2 uppercase letters");
            System.out.println("- 2 lowercase letters");
            System.out.println("- 3 digits");
            System.out.println("- 1 special character");
            return;
        }
        user.changePassword(newPassword);
        System.out.println("Password changed successfully!");
    }
}
