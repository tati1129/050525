package prof.lessons._08_06_Lesson16.javainputoutput.bytefilestream;
/*
пример базовой работы с побайтовыми потоками ввода/вывода (FileInputStream и FileOutputStream)
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) throws IOException {
        outputExample("test_stream.txt"); //запись в файл
        intputExample("test_stream.txt"); // чтение из файла

        // Вызывается метод outputExample, который записывает строку в файл test_stream.txt.
        // Затем вызывается метод intputExample, который читает этот файл и выводит его содержимое в консоль.

    }

    private static void outputExample(String file) throws IOException {

            FileOutputStream outputStream = new FileOutputStream(file);
            //Открываем поток записи в файл (если файла нет, он будет создан; если есть — будет перезаписан).

            outputStream.write("Привет, как дела?".getBytes());
            // ("Привет, как дела?".getBytes()) -> Преобразуем строку в массив байтов по умолчанию в системной кодировке (чаще всего UTF-8).
            // (outputStream.write( ... ) -> Записываем байты в файл.
            outputStream.close();
            //Закрываем поток — обязательно, чтобы освободить ресурсы.

    }

    private static void intputExample(String file) throws IOException {
        FileInputStream inputStream = new FileInputStream(file);
        //Открываем поток для чтения из файла.

        int data = inputStream.read();
        // Читаем один байт из файла. Метод возвращает -1, если достигнут конец файла.
        while (data!= -1){
            System.out.print((char) data + " ");
            data = inputStream.read();
        }
        // Цикл while (data != -1):
        // Каждый считанный байт преобразуется в char и печатается в консоль.
    }


}
