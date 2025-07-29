package prof.lessons._07_08_Lesson9.practice;

import java.util.Map;
import java.util.TreeMap;

public class Task6TelBookWithClass {
    public static void main(String[] args) {
            /*
    создать "телефонную книгу" имя -> номер телефона
    и отсортировать по именам
     */
        Map<Abonent,String> telBook = new TreeMap<>();

        Abonent abonent1 = new Abonent("Alice","Alice","");
        Abonent abonent2 = new Abonent("Alex","Alice","");
        Abonent abonent3 = new Abonent("Ruslan","Alice","");
        Abonent abonent4 = new Abonent("Bill","Alice","");
        Abonent abonent5 = new Abonent("Olga","Alice","");

        telBook.put(abonent1, "+49435626");
        telBook.put(abonent2, "+44352653556");
        telBook.put(abonent3, "+37612452356");
        telBook.put(abonent4, "+153623562");
        telBook.put(abonent5, "+3809532653");


        System.out.println(telBook);
    }
}
