package prof.lessons._08_06_Lesson16.javainputoutput.charfilestream;
/*
 пример копирования текстового файла с использованием символьных
  потоков с буферизацией (BufferedReader и BufferedWriter).
 */
import java.io.*;

public class WriteAndReadBufferCopyFile {
    public static void main(String[] args) throws IOException {
//        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/prof/lessons/_08_06_Lesson16/javainputoutput/resource/img/bufferText0505-original.txt"));
//        writer.write("Это оригинальный файл.");
//        writer.close();

        copyText("bufferText0505-original.txt", "bufferText0505-copy.txt");
        // копирует содержимое из одного текстового файла в другой
    }
    private static void copyText(String fileSource, String fileDestination) throws IOException {

        String path = "src/main/java/prof/lessons/_08_06_Lesson16/javainputoutput/resource/img/";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path + fileSource));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + fileDestination));
        //BufferedReader считывает файл построчно.
        //BufferedWriter записывает файл построчно.
        //FileReader и FileWriter работают с символами в системной кодировке.

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        //Каждая строка считывается и тут же записывается в новый файл.
        //newLine() вставляет перевод строки.
        //Одновременно строка выводится в консоль.

        bufferedReader.close();
        bufferedWriter.close();
        //Потоки закрываются — отлично, это важно для освобождения ресурсов.
    }
}
