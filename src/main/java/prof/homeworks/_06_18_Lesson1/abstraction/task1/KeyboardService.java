package prof.homeworks._06_18_Lesson1.abstraction.task1;

public class KeyboardService {
    public void changeLayot(Keyboard keyboard, Layout layout) {
        keyboard.setLayout(layout);
    }

    public void printCurrentLayout(Keyboard keyboard) {
        System.out.println("Текущая раскладка: " + keyboard.getLayout());
    }


}
