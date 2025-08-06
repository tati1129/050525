package prof.lessons._08_06_Lesson16.javainputoutput.charfilestream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriteAndRead {
    public static void main(String[] args) throws IOException {
        writeTextFile("text0505-demo.txt");
        readTextFile("text0505-demo.txt");

    }

    private static void writeTextFile(String fileName) throws IOException {
        String path = "src/main/java/prof/lessons/_08_06_Lesson16/javainputoutput/resource/img/";

        FileWriter fileWriter = new FileWriter(path + fileName);

        String message = "Привет, как дела?";

        fileWriter.write(message);
        fileWriter.close();

    }

    private static void readTextFile(String fileName) throws IOException {
        String path = "src/main/java/prof/lessons/_08_06_Lesson16/javainputoutput/resource/img/";

        FileReader fileReader = new FileReader(path + fileName);

        int symbol;

        while ((symbol = fileReader.read()) != -1){
            System.out.print((char) symbol + " ");
        }

        fileReader.close();

    }
}
