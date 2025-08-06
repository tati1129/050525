package prof.lessons._08_06_Lesson16.javainputoutput.javanio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioReadExample2 {
    public static void main(String[] args) throws IOException {
        Path myPath = Paths.get("test_nio.txt");
        //Создаётся объект Path, указывающий на файл test_nio.txt (относительно текущей директории).
        // Это путь к файлу, из которого ты будешь читать.

        String content = Files.readString(myPath, StandardCharsets.UTF_8);
        //Считывает всё содержимое файла целиком в одну строку content, используя кодировку UTF-8.
        //В отличие от readAllLines(), здесь результат — одна строка, включая все символы перевода
        // строки (\n), если они есть.
        System.out.println(content);
    }
}
