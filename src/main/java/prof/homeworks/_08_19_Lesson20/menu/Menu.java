package prof.homeworks._08_19_Lesson20.menu;

import prof.homeworks._08_19_Lesson20.service.CountryCodeManager;
import prof.homeworks._08_19_Lesson20.utills.InputValidator;
import prof.homeworks._08_19_Lesson20.utills.UserInputStatic;

public class Menu {
private final CountryCodeManager codeManager;

    public Menu(CountryCodeManager codeManager) {
        this.codeManager = codeManager;
    }



    public void start(){
    boolean running = true;
        while (running) {
        System.out.println("\n=== Country Code Menu ===");
        System.out.println("1. Find country by code");
        System.out.println("2. Выйти");
        System.out.print("Chose opion :");

            String choice = UserInputStatic.inputText("Choose option from menu").trim();

        switch (choice) {
            case "1":
                String code = UserInputStatic.inputText("Enter a country code (for example +380): ");

                // Добавляем +, если его нет
                if (!code.startsWith("+")) {
                    code = "+" + code;
                }

                // Валидация
                if (!InputValidator.isValidCountryCode(code)) {
                    System.out.println("Invalid code format!");
                    break;
                }

                String number = UserInputStatic.inputText("Enter phone number");
                if (!InputValidator.isValidNumber(number)){
                    System.out.println("Invalid number format! Or this number does not exist.");
                    break;
                }

                // Поиск страны
                String country = codeManager.getCountryName(code);
                System.out.println("The phone number " + code +" " + number +" belongs to a subscriber from "  + country + "!");
                break;

            case "2":
                running = false;
                System.out.println("Exit.");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

}
}
