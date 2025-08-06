package prof.lessons._07_10_Lesson11.generics.classes;

public class BoxDemo {
    public static void main(String[] args) {
        //вместо того чтоб создавать :
//        BoxForPlastic boxForPlastic = new BoxForPlastic();
//        BoxForPaper boxForPaper = new BoxForPaper();


        Box<Paper> paperBox = new Box<>();
        Box<Plastic> lasticBox = new Box<>();
        Box<Glass> glassBox = new Box<>();

    }
}
