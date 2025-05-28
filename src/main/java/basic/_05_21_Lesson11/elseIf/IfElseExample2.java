package basic._05_21_Lesson11.elseIf;

public class IfElseExample2 {
    public static void main(String[] args) {
        // для ввода данных используем класс UserInputStatic

        int userData = UserInputStatic.inputInt("Please enter integer number: ");

        // если число четное - напечатать один результат, если нет - то другой

        if (userData % 2 == 0) {
            System.out.println("Число " + userData + " - четное");
        } else {
            System.out.println("Число " + userData + " - не четное");
        }
    }
}
