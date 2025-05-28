package _05_19_Lesson10.studentWithgroup;

public class Group {
    private String groupName;
    private String startDate;
    private int countStudent;

    public Group(String groupName, String startDate, int countStudent) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.countStudent = countStudent;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getCountStudent() {
        return countStudent;
    }

    @Override
    public String toString() {
        return "Group{" +
                "группа :" + groupName +
                ", начало обучения : " + startDate +
                "количество студентов : " + countStudent +
                '}';
    }
}
