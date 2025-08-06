package prof.lessons._08_06_Lesson16.javainputoutput.bytefilestream;

import java.nio.charset.StandardCharsets;

public class NotAsciiExampleEnglish {
    public static void main(String[] args) {

        String text = "Hello";
        byte[] textAsByte = text.getBytes(StandardCharsets.UTF_8);

//        for (byte cur : textAsByte) {
//            int number = cur & 0xFF;
//            System.out.print(number + " ");
//        }

        for (byte b : textAsByte){
            System.out.printf("%04X ", b & 0xFF);
        }
    }
}
