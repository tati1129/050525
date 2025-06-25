package prof.homeworks._06_18_Lesson1.abstraction.task1;

import basic._06_10_Lesson20.UserInputStatic;

public class UserInterface {
   KeyboardService service;
   Keyboard keyboard;


    public UserInterface(KeyboardService service) {
        this.service = service;
        this.keyboard = new Keyboard(Layout.QWERTY);
    }

    public void  start(){
        boolean exit = false;

        while (!exit){
            System.out.println("--- МЕНЮ ---");
            System.out.println("1. Показать текущую раскладку");
            System.out.println("2. Изменить раскладку");
            System.out.println("3. Показать доступные раскладки");
            System.out.println("4. Выход");
            System.out.print("Ваш выбор: ");

            int userChoice = UserInputStatic.inputInt("Выберите операцию : ");
            switch (userChoice){
                case 1 -> service.printCurrentLayout(keyboard);
                case 2 -> {
                    Layout[] layouts = Layout.values();
                    for (int i = 0; i < layouts.length; i++) {
                        System.out.println((i + 1) + ". " + layouts[i]);
                    }
                        int choice = UserInputStatic.inputInt("Ваш выбор (номер): ");
                        if (choice >= 1 && choice <= layouts.length) {
                            Layout newLayout = layouts[choice - 1];
                            service.changeLayot(keyboard, newLayout);
                        } else {
                            System.out.println("Ошибка: некорректный номер.");
                        }


                }
                case 3 -> Keyboard.printAvailableLayouts();
                case 4 -> {
                    System.out.println("До свидания!");
                    exit = true;
                }
                default -> System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }




}
