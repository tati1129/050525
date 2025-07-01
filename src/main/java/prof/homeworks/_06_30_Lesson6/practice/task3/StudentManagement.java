package prof.homeworks._06_30_Lesson6.practice.task3;

import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.Map;

public class StudentManagement {
    private Map<Integer, Student > students;

    public StudentManagement() {
        students = new HashMap<>();
    }

    public void  addStudent(Integer id, String name){
        students.put(id,new Student(name, id));
    }

    public Student getStudent(Integer id){
        return students.get(id);
    }
    public void addGrade(int id, String subject, int grade){
        students.get(id).schoolSubject.put(subject,grade);
    }

    public double getAverageGrade(int id){
        double avg = 0;
       HashMap<String, Integer> subjects = students.get(id).getSchoolSubject();
       int count = subjects.size();
       for (Integer point : subjects.values()){
           avg += point;
       }
       return Math.round(avg/count * 100)/100;

    }
}
