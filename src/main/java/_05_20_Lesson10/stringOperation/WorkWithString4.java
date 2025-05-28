package _05_20_Lesson10.stringOperation;

public class WorkWithString4 {
    public static void main(String[] args) {
        String text = "012345-78-012345";

        System.out.println(text);

        // поиск индекса первого вхождения подстроки в наш текст
        // в случае если мой набор символов, который я проверяю
        // присутствует в нашем тексте, то будет возвращен индекс
        // с которого это начинается это вхождение. Если таких "вхождений" несколько
        // то нам возвратят индекс ПЕРВОГО вхождения.
        // если такого набора символов в тексте нет, то вернется -1

        int indexFirst = text.indexOf("78");
        System.out.println("index: " + indexFirst);

        int indexSymbol2 = text.indexOf("-");
        System.out.println("index '-': " + indexSymbol2);


        // по аналогии можно узнать индекс последнего вхождения

        int indexSymbol2last = text.lastIndexOf("-");
        System.out.println("last index '-': " + indexSymbol2last);


        // а если нам надо ЗАМЕНИТЬ в нашем тексте какие-то символы на другие

        String replacedAllLine = text.replace("-","*");

        System.out.println(replacedAllLine);

        String replaceFirstLine = text.replaceFirst("-","*");
        System.out.println(replaceFirstLine);
    }
}
