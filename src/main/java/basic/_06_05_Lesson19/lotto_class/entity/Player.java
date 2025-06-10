package basic._06_05_Lesson19.lotto_class.entity;

public class Player {
    private static int nextId = 1;//поле для хранения информации  о том сколько игроков есть

    private  int id; //идентефикатор игрока
    private String name;

    public Player(String name) {
        this.id = nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
