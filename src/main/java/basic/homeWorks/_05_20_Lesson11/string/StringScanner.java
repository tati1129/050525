package basic.homeWorks._05_20_Lesson11.string;


import basic.homeWorks._05_20_Lesson11.UserInput;

public class StringScanner {
    public static void main(String[] args) {
        UserInput input = new UserInput();

        String str1 = input.inputText("Введите 1е слово");
        String str2 = input.inputText("Введите 2е слово");

        String newStr = str1.substring(0,str1.length()/2 ) + str2.substring(0,str2.length()/2 );
        System.out.println(newStr);

    }
}
