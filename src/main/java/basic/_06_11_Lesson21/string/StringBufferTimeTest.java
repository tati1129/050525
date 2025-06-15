package basic._06_11_Lesson21.string;

public class StringBufferTimeTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100_000_000; i++) {
            sb.append(i);
            //System.out.println(str);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Время на проведение операции: " + (endTime - startTime));
    }
}
