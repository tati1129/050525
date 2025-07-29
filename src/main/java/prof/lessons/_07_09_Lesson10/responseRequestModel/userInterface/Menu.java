package prof.lessons._07_09_Lesson10.responseRequestModel.userInterface;

import basic._05_26_Lesson13.UserInputStatic;
import prof.lessons._07_09_Lesson10.responseRequestModel.entity.Product;
import prof.lessons._07_09_Lesson10.responseRequestModel.service.ProductService;

import java.util.List;

public class Menu {

    private ProductService service;

    public Menu(ProductService service) {
        this.service = service;
    }

    public void menu() {
        while (true) {
            System.out.println();
            printMenu();
            int userChoice = enterUserChoice();

            switch (userChoice) {
                case 1:
                    addNewProduct();
                case 2:
                    printAllProduct();
                case 3:
                    findById();
                case 4:
                    System.out.println("Работа приложения завершена!");
                    return;
            }
        }
    }

    private void findById() {
        int id = UserInputStatic.inputInt("Введите id товара для поиска");
        System.out.println(service.findById(id));
    }

    private void printMenu() {
        System.out.println("1. Ввод нового товара");
        System.out.println("2. Вывод всех товаров");
        System.out.println("3. Поиск товара по id");
        System.out.println("4. Exit");
    }

    private int enterUserChoice() {
        return UserInputStatic.inputInt("Выберите пункт меню: ");
    }


    private void addNewProduct() {
        int id = UserInputStatic.inputInt("Введите id  товара");
        String productName = UserInputStatic.inputString("Введите наименование товара");
        Double price = UserInputStatic.inputDouble("Введите цену товара");
        String description = UserInputStatic.inputString("Введите описание товара");

        boolean addResult = service.addNewProduct(id,productName,price,description);

        if (addResult){
            System.out.println("Продукт успешно добавлен!");
        }else {
            System.out.println("Error! Продукт добавить не удалось!");
        }
    }

    private void printAllProduct(){
        List<Product> allProducts = service.findAll();
        System.out.println("Список продуктов");
        for (Product prod : allProducts){
            System.out.println(prod);
        }
    }
}
