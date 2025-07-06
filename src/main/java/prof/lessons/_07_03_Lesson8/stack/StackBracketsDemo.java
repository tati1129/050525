package prof.lessons._07_03_Lesson8.stack;

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

        String[] strings = {
                "()",
                "()(())",
                "((()()()(())))",
                ")()(",
                "((())"
        };

        for (String arrElem : strings) {
            System.out.println(arrElem + " is correct? " + isCorreectDraket(arrElem));
        }
    }


    private static boolean isCorreectDraket(String stringLine) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stringLine.length(); i++) {
            char ch = stringLine.charAt(i);

            // если наш стек - пуст, то значит, что нет первоначальной открывающейся скобки - то есть нарушен порядок скобок
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
