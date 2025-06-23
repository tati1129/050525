package prof.practice.task1.var2;

public class TeaCollection {

    private Tea[] teas;
    private int teaCounter = 0;
    private  int teaIndex = 1;

    public  int add(Tea newTea){
        for (int i = 0; i < teas.length; i++) {
            if (teas[i] == null){
                teas[i] = newTea;
                return i;
            }
        }
        return -1;
    }
}
