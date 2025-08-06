package prof.lessons._08_06_Lesson16.javainputoutput.charfilestream;
/*
пример работы с символьными потоками (BufferedWriter и BufferedReader) — именно они подходят для чтения и
записи текстовых файлов, особенно когда в них есть русские символы.
 */
import java.io.*;

public class WriteAndReadBuffer {
    public static void main(String[] args) throws IOException {
        writeText("bufferText0505-demo.txt");
        readText("bufferText0505-demo.txt");
        //writeText(...) — метод создаёт и записывает текст в файл.
        //readText(...) — метод считывает этот файл и печатает его содержимое в консоль
    }

    private static void writeText(String fileName) throws IOException {

        String path = "src/main/java/prof/lessons/_08_06_Lesson16/javainputoutput/resource/img/";
        //Путь к папке, где будет сохранён файл.

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + fileName));
        //FileWriter — создаёт символьный поток записи в файл.
        //BufferedWriter — добавляет буферизацию (ускоряет запись, позволяет использовать newLine()).
        //Важно: по умолчанию используется системная кодировка (чаще всего UTF-8).


        bufferedWriter.write("Hello, World!"); //Последовательно записываются строки, включая и русские.
        bufferedWriter.newLine(); //newLine() добавляет символ новой строки, в зависимости от ОС (\n или \r\n).
        bufferedWriter.newLine();
        bufferedWriter.write("Как дела?");
        bufferedWriter.newLine();
        bufferedWriter.write("Изучаем Java");
        bufferedWriter.newLine();

        bufferedWriter.close();
        //Поток закрывается — обязательно! Иначе данные могут не записаться в файл до конца.

    }

    private static void readText(String filename) throws IOException {
        String path = "src/main/java/prof/lessons/_08_06_Lesson16/javainputoutput/resource/img/";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path + filename));
        //FileReader — символьный поток для чтения.
        //BufferedReader — ускоряет чтение и даёт удобные методы, например readLine().

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        //Считываются строки до конца файла.
        //readLine() возвращает null, когда достигнут конец файла.
        //Каждая строка выводится в консоль.

        bufferedReader.close();
        //Закрываем поток чтения.

    }
}
