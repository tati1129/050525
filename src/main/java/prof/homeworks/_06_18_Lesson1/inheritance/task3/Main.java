package prof.homeworks._06_18_Lesson1.inheritance.task3;

public class Main {
    public static void main(String[] args) {

        Developer developer1 = new Developer("Ann", 28,new String[] {"MyLibrary", "ContactBook", "TaskManager"} );
        Developer developer2 = new Developer("Tonny", 34,new String[] {"StudyPortal", "BlogSphere", "TaskManager"});

        Manager manager = new Manager("Steve", 42, new Employee[]{developer1,developer2});

        manager.printInfo();

        developer1.printInfo();

    }
}
