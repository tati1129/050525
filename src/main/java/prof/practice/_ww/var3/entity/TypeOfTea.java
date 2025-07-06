package prof.practice._ww.var3.entity;

public class TypeOfTea {
    private static int idCounter = 1;
    private int id;
    private String typeName;

    public TypeOfTea(String typeName) {
        this.id = idCounter++;
        this.typeName = typeName;
    }

    public int getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return "TypeOfTea{" +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
