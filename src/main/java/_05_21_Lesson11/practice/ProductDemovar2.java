package _05_21_Lesson11.practice;

import javaPro3._05_21.elseIf.UserInputStatic;

public class ProductDemovar2 {
    public static void main(String[] args) {
        // запросить у пользователя данные для создания нового продукта
        // создать новый продукт ТОЛЬКО если введенные данные удовлетворяют критериям:
        // - название не может быть пустым (ни одного символа или все - пробелы)
        // - цена не может быть отрицательной или 0

        String newProductName = UserInputStatic.inputText("Введите название продукта : ");
        int newProductPrice = UserInputStatic.inputInt("Введите цену продукта : ");

        boolean checkProductName = !newProductName.isBlank() && newProductName.length()>=5 && newProductName.length()<15;

        boolean checkProductPrice = newProductPrice > 0;

        if (checkProductName && checkProductPrice) {
            Product product1 = new Product(newProductName, newProductPrice);
            System.out.println(product1);
        } else {
            if (!checkProductPrice) {
                System.out.println("Невозможно создать новый продукт с ценой меньше или равной нулю");
            }
            if (!checkProductName) {
                System.out.println("Невозможно создать новый продукт с таким названием");
            }
        }
    }
}
