package prof.homeworks._07_03_Lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MapBracketsDemo {
    public static void main(String[] args) {
        /*
        проверить правильность последовательности скобок
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

        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put('}', '{');
        bracketsMap.put(']', '[');


        //Проверка на четность длины: если кол-во скобок нечетное, сразу false
        if (stringLine.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i <= stringLine.length(); i++) {
            char ch = stringLine.charAt(i);

            //Если открывающаяся скобка - добавляем в стек
            if (bracketsMap.containsValue(ch)) {
                stack.push(ch);
            } else if (bracketsMap.containsKey(ch)) {
                if (stack.isEmpty()) {
                    return false;
                    // если стек пуст, то нет пары ➔ ошибка
                }
                char top = stack.pop();
                if (top != bracketsMap.get(ch)) {
                    return false;
                }

            }
        }
        //если после всей строки стек НЕ пуст – значит, остались незакрытые скобки
        return stack.empty();
    }
}
