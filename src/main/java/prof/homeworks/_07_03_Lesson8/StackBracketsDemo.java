package prof.homeworks._07_03_Lesson8;

import java.util.Stack;

public class StackBracketsDemo {
    public static void main(String[] args) {
        /*
        проверить правитльность последовательности скобок
        (())
        ()()(())
        ((()))()(())

        {}[{()}]
         */

//        String[] strings = {
//                "()",
//                "()(())[]",
//                "(([]()()(())))",
//                ")()(",
//                "((())",
//                "(){}[]",
//                "({})"
//        };
        String[] strings = {
                "()",
                "()((}))[]",
                "[(([]()()(())}))",
                ")(})(",
                "((([[[))",
                "(){}[)]",
                "({})"
        };

        for (String arrElem : strings) {
            System.out.println(arrElem + " is correct? " + isCorreectBraket(arrElem));
        }
    }


    private static boolean isCorreectBraket(String stringLine) {
        Stack<Character> stack = new Stack<>();

        //Проверка на четность длины: если кол-во скобок нечетное, сразу false
        if (stringLine.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < stringLine.length(); i++) {
            char ch = stringLine.charAt(i);

            //Если открывающаяся скобка - добавляем в стек
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.empty()) {
                    return false;
                    // если стек пуст, то нет пары ➔ ошибка
                }
                char top = stack.pop();
                // Проверка соответствия пар
                if (ch == ')' && top != '(' ||
                        ch == ']' && top != '[' ||
                        ch == '}' && top != '{') {
                    return false;
                }

            }
        }
        //если после всей строки стек НЕ пуст – значит, остались незакрытые скобки
        return stack.empty();
    }
}
