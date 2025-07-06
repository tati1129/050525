package prof.practice._ww.var3.entity;

import java.util.Arrays;

public class Manufacture {
    private static int idCounter = 1;
    private int id;
    private String name;
    private TypeOfTea[] teaTypes;
    private int teaTypeCounter;
    private Tea[] teas;
    private int teaCounter;


    public Manufacture(String name) {
        this.id = idCounter++;
        this.name = name;
        this.teaTypes = new TypeOfTea[20];
        this.teaTypeCounter = 0;
        this.teas = new Tea[20];
        this.teaTypeCounter = 0;

    }


    public String addTeaType(TypeOfTea newType) {
        if (teaTypeCounter < teaTypes.length) {
            teaTypes[teaTypeCounter++] = newType;
            return "Новый тип чая добавлен";
        } else {
            return "Добавить новый тип не удалось!";
        }
    }

    public String addTea(Tea tea) {
        for (int i = 0; i < teaCounter; i++) {
            if (teas[i].getManufacturer().equals(tea.getManufacturer()) && teas[i].getType().equals(tea.getType())) {
                return "Этот чай уе существует у этого производителя";
            }
        }

        if (teaCounter < teas.length) {
            teas[teaCounter++] = tea;
            return "Чай " + tea + " добавлен!";
        }
        return "Не удалось добавить: место в массиве ограничено.";
    }


    public int getId() {
        return id;
    }

    public TypeOfTea[] getTeaTypes() {
        return Arrays.copyOf(teaTypes, teaTypeCounter);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "name='" + name + '\'' +
                ", teaTypes=" + Arrays.toString(teaTypes) +
                '}';
    }
}
