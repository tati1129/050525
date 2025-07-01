package prof.practice.practice_06_27.mapKeyCollision;

import java.util.Objects;

public class CatOwner {
    private String name;

    public CatOwner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CatOwner owner = (CatOwner) o;
        return Objects.equals(name, owner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "CatOwner{" +
                "name='" + name + '\'' +
                '}';
    }
}
