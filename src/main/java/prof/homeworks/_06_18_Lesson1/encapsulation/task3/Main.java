package prof.homeworks._06_18_Lesson1.encapsulation.task3;

/*
Задача 3: Конфигурация системы

Разработайте класс SystemConfiguration, который хранит конфигурационные параметры системы (например, уровень логирования, путь к файлам логов). Доступ к изменению этих параметров должен быть строго контролируемым через методы, предотвращающие установку некорректных значений.
 */
public class Main {
    public static void main(String[] args) {
        SystemConfiguration configuration = new SystemConfiguration("INFO", "/var/logs/system.log");
        ServiceConfiguraion serviceConfiguraion = new ServiceConfiguraion(configuration);


        // Получаем текущую конфигурацию
        System.out.println(serviceConfiguraion.getSystemConfiguration());

        // Обновляем уровень логирования
        System.out.println(serviceConfiguraion.updateLogLevel("ERROR"));

        // Обновляем путь к файлу логов
        System.out.println(serviceConfiguraion.updateLogFilePath("/var/logs/errors.log"));

        // Печатаем обновленную конфигурацию
        System.out.println(serviceConfiguraion.getSystemConfiguration());


        // Попытка установить некорректный уровень логирования
        System.out.println(serviceConfiguraion.updateLogLevel("VERBOSE"));
    }
}
