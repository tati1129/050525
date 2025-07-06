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

        for (int i = 0; i < stringLine.length(); i++) {
            char ch = stringLine.charAt(i);

            // если наш стек - пуст, то значит, что нет первоначальной открывающейся скобки - то есть нарушен порядок скобок
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}'){
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                 if (ch == ')' && top != '(' ||
                 ch == ']' && top != '[' ||
                 ch == '}' && top != '{') {
                   return  false;
                }

            }
        }
        return stack.empty();
    }
}
