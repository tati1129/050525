package prof.lessons._07_09_Lesson10.responseRequestModel2.userInterface;

import basic._05_26_Lesson13.UserInputStatic;
import prof.lessons._07_09_Lesson10.responseRequestModel2.dto.ProductRequestDto;
import prof.lessons._07_09_Lesson10.responseRequestModel2.dto.ProductResponseDto;
import prof.lessons._07_09_Lesson10.responseRequestModel2.entity.Product;
import prof.lessons._07_09_Lesson10.responseRequestModel2.service.ProductService;

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
                    break;
                case 2:
                    printAllProduct();
                    break;
                case 3:
                    printProductById();
                    break;
                case 4:
                    System.out.println("Работа приложения завершена!");
                    return;
            }
        }
    }

    private void printProductById() {
        int id = UserInputStatic.inputInt("Введите id товара для поиска");
        ProductResponseDto response = service.findById(id);
        printResult(response);
    }


    private void printResult(ProductResponseDto response){
        if (response.isResult()){
            System.out.println("Операция прошла успешно!");
            System.out.println(response.getMessage());
        }else {
            System.out.println("Операцию провести не удалось!");
            System.out.println(response.getMessage());
        }
    }


    private void addNewProduct() {
//        int id = UserInputStatic.inputInt("Введите id  товара");
        String productName = UserInputStatic.inputString("Введите наименование товара");
        Double price = UserInputStatic.inputDouble("Введите цену товара");
        String description = UserInputStatic.inputString("Введите описание товара");

        ProductRequestDto request = new ProductRequestDto(productName,price,description);
        ProductResponseDto response = service.addNewProduct(request);

       printResult(response);
    }

    private void printAllProduct(){
        List<Product> allProducts = service.findAll();
        System.out.println("Список продуктов");
        for (Product prod : allProducts){
            System.out.println(prod);
        }
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


}
