package prof.lessons._07_08_Lesson9.practice;

import java.util.Set;
import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {

        Set<Meeting>  meetings = new TreeSet<>();

        meetings.add(new Meeting("07-07-2025","12:00","Встреча № 1"));
        meetings.add(new Meeting("07-07-2025","09:30","Лекция"));
        meetings.add(new Meeting("07-07-2025","20:00","Самолет"));
        meetings.add(new Meeting("08-07-2025","11:00","Лекция"));
        meetings.add(new Meeting("08-07-2025","10:00","Встреча # 2"));


        System.out.println(meetings);
    }
}
