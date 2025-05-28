package basic.homeWorks._05_20_Lesson11.string;

public class StringTask1 {
    public static void main(String[] args) {
        //1 Создайте строку через new - I study Basic Java!
        String str1 = new String("I study Basic Java!");

        //2 Напишите метод, который принимает в качестве параметра строку,
        //передайте в этот метод строку, которую создали в п.1
        printStr(str1);

        //3 Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println("The last symbol is : " + str1.charAt(str1.length() - 1));

        //4 Проверить, содержит ли ваша строка подстроку “Java”.
        // Используем метод String.contains().
        System.out.println("Is contains : " + str1.contains("Java"));

        //5 Заменить все символы “а” на “о”.
        System.out.println("Replace 'a' to 'o' : "+str1.replace('a', 'o'));

        //6 Преобразуйте строку к верхнему регистру.
        System.out.println(str1.toLowerCase());

        //7 Преобразуйте строку к нижнему регистру.
        System.out.println(str1.toUpperCase());

        //8 Вырезать строку Java c помощью метода String.substring().
        System.out.println(str1.substring(str1.indexOf("Java"), (str1.indexOf("Java") + "Java".length())));


    }
    //2 Напишите метод, который принимает в качестве параметра строку,
    // передайте в этот метод строку, которую создали в п.1
    public static  void printStr(String string){
        System.out.println("Вот созданная строка : " + string);
    }
}
