package prof.lessons._08_06_Lesson16.javainputoutput.javanio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioReadExample {
    public static void main(String[] args) throws IOException {
        Path myPath = Paths.get("test_nio.txt");
        //Создаётся объект Path, указывающий на файл test_nio.txt (относительно текущей директории).
        // Это путь к файлу, из которого ты будешь читать.

        List<String> lines = Files.readAllLines(myPath, StandardCharsets.UTF_8);

        for (String line : lines){
            System.out.println(line);
        }
        /*
            * Чтение всех строк из файла test_nio.txt.
            * Результат — список строк (List<String>), где каждая строка — это строка из файла.
            * StandardCharsets.UTF_8 — важный момент: указываешь, что читаешь текст в кодировке UTF-8
            (иначе, например, русские буквы могут отображаться криво).
         */
    }
}
