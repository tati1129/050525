package prof.lessons._07_08_Lesson9.practice;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /*
    хранить оценки студентов по тестам, часто добавлять новые
    и получать оценки по порядковому номеру

    Вариант:
    - класс Студент - в нем ТОЛЬКО данных студента
    никаких оценок нет
    эти студенты хранятся в ArrayList, где у каждого студента
    свой индекс
    если мы НИКОГДА не изменяем эту коллекцию (только добавляем новых),
    то значит номер индекса ВСЕГДА соответсвует одному и тому же студенту
    Тогда ВСЕ оценки по любому предмету могут тагже храниться ArrayList,
    где индекс этой оценки будет соответствовать индексу студента
    Коллекция оценок по математики, по физике, по истории и тд
    То есть хранени оценок будет по предметам
     */

        List<String> students = new ArrayList<>();

        students.add("Alex");
        students.add("John");
        students.add("Tom");
        students.add("Steve");


        int indexAlex = 0;

        List<Integer> mathGrade = new ArrayList<>();
        mathGrade.add(4);
        mathGrade.add(5);
        mathGrade.add(3);
        mathGrade.add(5);

        System.out.println(mathGrade.get(indexAlex));
    }
}
