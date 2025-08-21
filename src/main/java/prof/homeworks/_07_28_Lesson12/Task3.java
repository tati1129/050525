package prof.homeworks._07_28_Lesson12;
/*
Напишите функциональный интерфейс для проверки, является ли строка палиндромом.
 */


import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        String str1 = "manam";
        String str2 = "file";

        Predicate<String> palindromeCheck = (String str) -> str.equalsIgnoreCase( new StringBuilder(str1).reverse().toString());
        boolean result1 = isPalindrome(str1,palindromeCheck);
        boolean result2 = isPalindrome(str2,palindromeCheck);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static boolean isPalindrome(String str, Predicate<String> predicate) {
        return predicate.test(str);
    }
}
