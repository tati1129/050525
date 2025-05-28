package basic._05_19_Lesson9.manager;

import javaPro3._05_19.UserInput;

public class ManagerService {

    public Manager createManager(){
        UserInput managerInput = new UserInput();

        String managerName = managerInput.inputText("Enter user name :");
        String managerEmail = managerInput.inputText("Enter user email :");

        Manager manager = new Manager(managerName, managerEmail);
        return  manager;
    }
}
