package prof.practice.practice_06_27.task2;

public class Rector {
    private String id;
    private String name;

    public Rector(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Rector{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
