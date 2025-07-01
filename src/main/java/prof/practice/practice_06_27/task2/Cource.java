package prof.practice.practice_06_27.task2;

import java.util.ArrayList;

public class Cource {
    private String courceId;
    private String title;
   private Rector rector;
   private ArrayList<Student> students;

    public Cource(String courceId, String title) {
        this.courceId = courceId;
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void  addStudent (Student student){
        this.students.add(student);
    }
    public void  assignRector (Rector rector){
        this.rector = rector;
    }

    public Rector getRector() {
        return rector;
    }

    public String getCourceId() {
        return courceId;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Cource{" +
                "courceId='" + courceId + '\'' +
                ", title='" + title + '\'' +
                ", rector=" + rector +
                ", students=" + students +
                '}';
    }
}
