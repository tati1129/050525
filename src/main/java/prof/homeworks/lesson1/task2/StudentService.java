package prof.homeworks.lesson1.task2;

import java.util.Arrays;

public class StudentService {
    StudentsRepository repository;

    public StudentService(StudentsRepository repository) {
        this.repository = repository;
    }

    public Student[] createStudentFromUserInput(){
       return repository.addStudent();
    }

    public Student[] sortByLastName(Student[] students){
//        Student[] sorted = new Student[students.length];
//        int index = 0;
//        String[] arrayLastName = new String[students.length];
//        for (int i = 0; i < students.length; i++) {
//            arrayLastName[i] = students[i].getLastName();
//        }
//        Arrays.sort(arrayLastName);
//
//        for (int i = 0; i < arrayLastName.length-1; i++) {
//            for (int j = 0; j <students.length -1-i ; j++) {
//                if (arrayLastName[i].equalsIgnoreCase(students[j].getLastName())){
//                    sorted[index++] = students[j];
//                }
//
//            }
//        }

        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length - 1 - i ; j++) {
                String lastName1 = students[j].getLastName();
                String lastName2 = students[j+1].getLastName();

                if (lastName1.compareToIgnoreCase(lastName2) > 0){
                    Student temp = students[j];
                    students[j] = students[j +1];
                    students[j +1] = temp;
                }
            }
        }
        return students;
    }

    public void printAll(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }


}
