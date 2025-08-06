package prof.lessons._08_06_Lesson16.javainputoutput.javanio;
/*
 пример записи данных в файл с использованием Java NIO (New I/O) — более современного
  и мощного API по сравнению с FileWriter, BufferedWriter и т.п.
 */
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class NioAppendExample {
    public static void main(String[] args) throws IOException {
        Path myPath = Paths.get("test_nio.txt");
/*
        Paths.get(...) возвращает объект Path, представляющий путь к файлу test_nio.txt.
        Это абстракция пути в файловой системе, аналог File, но гибче.
        Путь здесь относительный (относительно корня проекта или рабочей директории).
 */
        Files.write(
                myPath,
                Arrays.asList("Строка, добавленная через NIO"),
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, // файл будет создан если не существует
                StandardOpenOption.APPEND // добавит данные в конец
        );
        /*
            Files.write(...):
                myPath — куда записывать.
                Arrays.asList(...) — что записывать: список строк (можно много строк).
                StandardCharsets.UTF_8 — использовать UTF-8 (поддерживает русский текст).
                StandardOpenOption.CREATE — создать файл, если он не существует.
                StandardOpenOption.APPEND — дописать в конец (иначе содержимое перезапишется).
         */
    }
    /*
    Если test_nio.txt не существует, он будет создан, и в него запишется строка:
    Строка, добавленная через NIO
    Если файл уже есть, то строка просто добавится в конец файла.
     */
}
