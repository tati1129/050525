package prof.homeworks._06_25_Lesson4.arrayList;
/*
        создать коллекцию телефонов
        показать что она пустая
        добавить один элемент
        показать что он добавлен
        добавить до 5 элементов
        показать коллекцию
        удалить один элемент по индексу
        УДАЛИТЬ ОДИН ЭЛЕМЕНТ как объект
        показать коллекцию
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Phone> list = new ArrayList<>();

        System.out.println(list);


        list.add(new Phone("Samsung Galaxy", 900));


        list.add(new Phone("IPhone 16", 1900));
        list.add(new Phone("IPhone 15", 900));
        list.add(new Phone("IPhone 14", 900));
        list.add(new Phone("Xiaomi", 500));
        list.add(new Phone("vivo", 400));


        printList(list);
        System.out.println();
        System.out.println("Delete IPhone 14 with index 3");
        list.remove(3);

        printList(list);

        System.out.println();
        System.out.println("Delete IPhone 15 like object");
        list.remove(new Phone("IPhone 15", 900));
        printList(list);
    }

    public static void printList(ArrayList<Phone> list) {
        for (Phone phone : list) {
            System.out.println(phone);
        }
    }
}
