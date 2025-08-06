package prof.lessons._08_06_Lesson16.javainputoutput.bytefilestream;

public class AsciiExample {
    public static void main(String[] args) {
        for (int i = 0; i < 255; i++) {
            char currentChar = (char) i;
            System.out.println(i + " : " + currentChar);
        }
    }
}
