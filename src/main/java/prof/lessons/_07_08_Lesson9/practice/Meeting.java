package prof.lessons._07_08_Lesson9.practice;

public class Meeting implements Comparable<Meeting> {
    private String date;
    private String time;
    private String description;

    public Meeting(String date,String time, String description) {
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Meeting another) {
        int result = date.compareTo(another.date);
        if (result == 0) result = time.compareTo(another.time);
        if (result == 0) result = description.compareTo(another.description);

        return result;
    }
}
