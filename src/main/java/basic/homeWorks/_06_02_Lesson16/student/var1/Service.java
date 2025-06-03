package basic.homeWorks._06_02_Lesson16.student.var1;


public class Service {
    public Group[] createGroup(Student[] students, String groupName) {
        int count = 0;

// Считаем количество студентов в нужной группе
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroupName().equals(groupName)) {
                count++;
            }
        }
        // Создаем массив нужного размера
        Student[] newList = new Student[count];
        int index = 0;
        for (int i = 0; i < students.length; i++) {

            if (students[i].getGroupName().equals(groupName)) {
                newList[index] = students[i];
                index++;
            }
        }

        Group group = new Group(groupName, newList);
        return new Group[]{group};
    }
}
