package prof.practice.task1.var1;

public class TeaApp {
    public static void main(String[] args) {
        TeaUtil teaUtil = new TeaUtil();
        TeaCollection repository = new TeaCollection(10);

        repository.add(new Tea(0,"Apsara","Herbal","Apple"));
        repository.add(new Tea(1,"Lipton","Black","Earl Grey"));
        repository.add(new Tea(2,"Apsara","Black","English breakfast"));
        repository.add(new Tea(3,"Lipton","Green","Green + Mint"));
        repository.add(new Tea(4,"GreenField","Black","Black TEa"));
        repository.add(new Tea(5,"Apsara","Green","Jasmine"));
        repository.add(new Tea(6,"GreenField","Green","Green + Milk"));
        repository.add(new Tea(7,"GreenField","Herbal","Carcade"));
        repository.add(new Tea(8,"Lipton","Herbal","Japan Cherry"));

        printInfo(repository.findAll());

        System.out.println("Элемент коллекции с id  = 4");
        System.out.println(repository.findById(4));

        System.out.println("Элементы коллекции с производителем: Lipton");
        System.out.println(repository.findByManufactorer("Lipton"));
        System.out.println("Элементы коллекции с производителем: Apsara");
        System.out.println(repository.findByManufactorer("Apsara"));

        System.out.println("Коллекция отсортированная по производителям: ");
        printInfo(teaUtil.sortByManufacturer(repository.findAll()));

        System.out.println("Удаляем №3");
        repository.deleteTeaFroCollection(3);
        printInfo(repository.findAll());


        System.out.println("Удаляем №7");
        repository.deleteTeaFroCollection(7);
        printInfo(repository.findAll());
    }

    private  static  void printInfo(Tea[] teas){
        for (Tea tea : teas){
            System.out.println(tea);
        }
    }
}
