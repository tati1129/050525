package prof.lessons._07_03_Lesson8.stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // добавим элементы

        stack.push(10);
        stack.push(5);
        stack.push(17);
        stack.push(21);
        stack.push(1);
        stack.push(35);
        stack.push(12);
        stack.push(77);


        System.out.println("Стек после добавления элементов: " + stack);

        // просмотр верхнего элемента (без его извлечения из коллекции)

        Integer topElement = stack.peek();

        System.out.println("Верхний элемент: " + topElement);

        System.out.println("Стек: " + stack);

        System.out.println("Второй раз постмотрим на вершину стека: " + stack.peek());

        // проверим нахождение элемента в нашей коллекции

        Integer searchElement = 5;
        int position = stack.search(searchElement);

        if (position != -1) {
            System.out.println("Элемент " + searchElement + " найден в коллекции на позиции: " + position);
        } else {
            System.out.println("Элемент " + searchElement + " в коллекции не найден");
        }

        // получение верхнего элемента (извлечение из коллекции)

//        topElement = stack.pop();
//        System.out.println("Верхний элемент: " + topElement);
//
//        System.out.println("Стек: " + stack);


        while (!stack.empty()) {
            System.out.println("Верхний элемент: " + stack.pop());
            System.out.println("Стек: " + stack);
        }

    }
}
