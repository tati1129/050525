package prof.lessons._07_03_Lesson8.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {

//        Deque<Integer> integerDeque = new LinkedList<>();
        Deque<Integer> integerDeque = new ArrayDeque<>();

        integerDeque.addLast(1);
        integerDeque.addFirst(2);
        integerDeque.addFirst(0);
        integerDeque.addLast(3);
        integerDeque.addFirst(7);
        integerDeque.addLast(7);

        System.out.println("Deque после добавления элементов: " + integerDeque);


        // просмотр элементов в начале и конце

        Integer firstElement = integerDeque.peekFirst();
        Integer lastElement = integerDeque.peekLast();

        System.out.println("firstElement = " + firstElement);
        System.out.println("lastElement = " + lastElement);


        // удаление элементов

        System.out.println(integerDeque.removeFirst());
        System.out.println(integerDeque.removeLast());

        System.out.println("Deque после удаления элементов: " + integerDeque);

        System.out.println(integerDeque.pollFirst());
        System.out.println(integerDeque.pollLast());


        System.out.println(integerDeque.pollFirst());
        System.out.println(integerDeque.pollLast());

        System.out.println("Deque после удаления элементов: " + integerDeque);


    }
}
