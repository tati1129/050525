package _05_13_Lesson7.tasks;

public class Storage {
    int quantityItems;

    public Storage(int quantityItems) {
        this.quantityItems = quantityItems;
    }

    public void issueGoods(int quantity){
        quantityItems = quantityItems - quantity;
        System.out.println(quantity + "is issue from storage");
        System.out.println();


    }

    public void printStock(){
        System.out.println("The stock balance is " + quantityItems + " items");
    }
}

