package basic._06_11_Lesson21.string;

import java.util.Arrays;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        sb.append(12);
        sb.append(" стульев");
        sb.append(".");
        sb.append(" Ильф и Петров");
        sb.append(true);

        sb.append(Arrays.asList(1, 2, 3));

        System.out.println(sb);


    }
}
