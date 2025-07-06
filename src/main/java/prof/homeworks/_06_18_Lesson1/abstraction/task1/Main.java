package prof.homeworks._06_18_Lesson1.abstraction.task1;

/*
Создайте абстрактный класс InputDevice, который включает абстрактные методы connect и disconnect, а также может содержать поля или неабстрактные методы, общие для всех устройств ввода.
От этого абстрактного класса наследуйте классы Keyboard и Mouse, реализуя абстрактные методы.
 */
public class Main {
    public static void main(String[] args) {

        KeyboardService service = new KeyboardService();
        UserInterface ui = new UserInterface(service);

        Keyboard keyboard = new Keyboard("MX Keys", "Logitech", Layout.QWERTY);
        Mouse mouse = new Mouse("MX Master 3", "Logitech", 1600, "Черный");

        mouse.connect();
        mouse.disconnect();


        keyboard.connect();


        ui.start();
        keyboard.disconnect();
    }
}
