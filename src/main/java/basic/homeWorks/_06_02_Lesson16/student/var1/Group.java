package basic.homeWorks._06_02_Lesson16.student.var1;

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
    public String toString() {
        String result = "Group: " + groupName + " [";
        for (int i = 0; i < studentsForGroup.length; i++) {
            result += studentsForGroup[i].getName();
            if (i < studentsForGroup.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
