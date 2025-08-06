package prof.lessons._08_06_Lesson16.javainputoutput.bytefilestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {          // Объявление класса, который будет выполнять копирование файла.
    public static void main(String[] args) throws IOException {
        //throws IOException означает, что возможные ошибки при работе с файлами не обрабатываются
        // вручную внутри метода, а пробрасываются дальше.

        copyExample("pic1.jpeg", "pic1_copy.jpeg");
    }

    private static void copyExample(String fileSource, String fileTarget) throws IOException {

        String path = "src/main/java/prof/lessons/_08_06_Lesson16/javainputoutput/resource/img/";

        FileOutputStream outputStream = new FileOutputStream(path + fileTarget); // для чтения байтов из файла.
        FileInputStream inputStream = new FileInputStream(path + fileSource); // для записи байтов в файл.
        //Создаётся поток inputStream для чтения байтов из файла fileSource.
        //Создаётся поток outputStream для записи байтов в файл fileTarget.

        int readByte; //Переменная для хранения прочитанного байта.

        do {
            readByte = inputStream.read();
            if (readByte >= 0) outputStream.write(readByte);
        }while (readByte != -1);
        //Цикл, читающий байты из файла и записывающий их в другой файл:
        // * inputStream.read() читает один байт и возвращает его как int (значение от 0 до 255).
        // * Если байт прочитан успешно (>= 0), он записывается в выходной поток.
        // * Когда достигнут конец файла, read() возвращает -1, и цикл завершает работу.

        inputStream.close();
        outputStream.close();
        //Закрытие потоков — обязательно! Иначе ресурсы (файлы, память) не освободятся.
    }


}
