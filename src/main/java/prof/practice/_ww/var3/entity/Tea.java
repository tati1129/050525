package prof.practice._ww.var3.entity;

public class Tea {
    private static int idCounter = 1;
    private int id;
    private String manufacturer;
    private String type;


    public Tea(int id, String manufacturer, String type) {
        this.id = idCounter++;
        this.manufacturer = manufacturer;
        this.type = type;

    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
