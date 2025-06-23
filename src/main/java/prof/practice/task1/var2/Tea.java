package prof.practice.task1.var2;

import java.util.Objects;

abstract public class Tea {

    private int id;
    private String manufacturer;

    public Tea(int id, String manufacturer) {
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
