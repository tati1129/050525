package prof.lessons._08_06_Lesson16.javainputoutput.workfilesystem;
/*
пример работы с классом File в Java!
Он показывает, как:
    * проверять, существует ли файл или папка,
    * создавать папки,
    * определять, является ли объект директорией,
    * просматривать содержимое папки.
 */
import java.io.File;
import java.util.Arrays;

public class FileSystemOperations {
    public static void main(String[] args) {
        File file = new File("text.txt");
        //Создаётся объект File, ссылающийся на файл text.txt.
        //⚠️ На этом этапе файл не создаётся физически, это просто объект в памяти, указывающий на путь.

        boolean isExist = file.exists();
        /*
        Проверяем, существует ли файл text.txt в текущей рабочей директории.
            * Если файл есть — вернёт true.
            * Если нет — false.
         */
        System.out.println("Does file already exist? " + isExist);

        //  ------- Создание новой папки:

        File dir = new File("new_dir");
        //new File("new_dir") — создаёт объект, указывающий на папку new_dir.

        boolean wasCreate = dir.mkdir(); // make directory
        //mkdir() — создаёт одну папку (не вложенные).
        //Возвращает true, если папка была создана, false — если она уже существует или не получилось создать.

        System.out.println("Was dir create? " + wasCreate);

        //---------Проверка: это папка?

        File directory = new File("new_dir");
        boolean isDir = directory.isDirectory();
        // isDirectory() проверяет: действительно ли directory указывает на существующую папку

        System.out.println("Это папка? " + isDir);

        // -----Удаление папки (закомментировано):

//        boolean successDelete = directory.delete();//delete() — удаляет файл или пустую папку.
//        System.out.println(successDelete);//Если в папке что-то лежит — delete() вернёт false.

        // --------Получение содержимого папки:
        //  а что внутри директории

        String[] filenames = directory.list();
        //list() возвращает имена файлов/папок внутри directory как массив строк

        System.out.println(Arrays.toString(filenames));


        File[] files = directory.listFiles();
        //listFiles() возвращает массив объектов File, каждый из которых можно дальше исследовать (isFile(), length(), lastModified() и т.д.)

        System.out.println(Arrays.toString(files));


    }
}
