package basic.homeWorks._06_02_Lesson16.student.var2;


import java.util.Arrays;

public class Group {
    private String groupName;
    private Student[] studentsForGroup;

    public Group(String groupName, Student[] studentsForGroup) {
        this.groupName = groupName;
        this.studentsForGroup = studentsForGroup;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudentsForGroup() {

        return studentsForGroup;
    }

    public void setStudentsForGroup(Student[] studentsForGroup) {
        this.studentsForGroup = studentsForGroup;
    }

    @Override
    public String
    toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", studentsForGroup=" + Arrays.toString(studentsForGroup) +
                '}';
    }
}
