package prof.lessons._07_08_Lesson9.practice;

import java.util.Map;
import java.util.TreeMap;

public class Task6TelBook {
    public static void main(String[] args) {
            /*
    создать "телефонную книгу" имя -> номер телефона
    и отсортировать по именам
     */
        Map<String,String> telBook = new TreeMap<>();

        telBook.put("Alice", "+49435626");
        telBook.put("Alex", "+44352653556");
        telBook.put("Ruslan", "+37612452356");
        telBook.put("Bill", "+153623562");
        telBook.put("Olga", "+3809532653");

        System.out.println(telBook);
    }
}
