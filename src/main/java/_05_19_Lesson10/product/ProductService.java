package _05_19_Lesson10.product;


import javaPro3._05_19.UserInput;

public class ProductService {

    public Category createCategory(){
        UserInput input = new UserInput();

        String title = input.inputText("Введите название категории товаров");
        String info = input.inputText("Введите информацию о категории товаров");

        Category category = new Category(title,info);
        return  category;
    };

    public Product createProduct(Category category){

        UserInput input = new UserInput();

        String productTitle = input.inputText("Введите наименование товара : ");
        int price = input.inputInt("Введите цену товара : ");
        int quntity = input.inputInt("Введите количество товара : ");

        Product product = new Product(productTitle, category, price,quntity);
        return  product;
    }
}
