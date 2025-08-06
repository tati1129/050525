package prof.lessons._07_10_Lesson11.generics.classes;

public class Box <MyType> {

    private MyType item;

    public MyType getItem(){
        return item;

        /*
                * Рекомендации от Oracle для обозначения типов в дженериках
                *
                * T - type, для обознпчения параметра в произвольных классах
                *
                * N - number, для чисел
                *
                * E - element, для элементов параметризованных коллекций
                *
                * K - key, для ключей map-структур
                *
                * V - value, для значений map-структур
                *
                * S, U, V - применяется, когда в дженерик-классе несколько параметров
     */
    }
}
