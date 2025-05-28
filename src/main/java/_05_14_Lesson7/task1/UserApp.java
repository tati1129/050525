package _05_14_Lesson7.task1;

import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);

        System.out.println("Enter ifo for registration");

        String name = userInput.inputText("Enter name");
        String email = userInput.inputText("Enter email");
        String adress = userInput.inputText("Enter adress");
        String password = userInput.inputText("Enter password");
        String department = userInput.inputText("Enter department");

        User user = new User(name,email,adress, password,department);

        System.out.println(user);
        scanner.close();

    }
}
