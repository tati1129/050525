package basic.homeWorks._06_12_Lesson22.front;


import basic._06_12_Lesson22.var2.Car;
import basic._06_12_Lesson22.var2.CarService;
import basic._06_12_Lesson22.var2.UserInputStatic;
import basic.homeWorks._06_12_Lesson22.entity.Item;
import basic.homeWorks._06_12_Lesson22.service.ItemService;

public class UserMenu {

    private ItemService service;


    public UserMenu(ItemService service) {
        this.service = service;
        service.fillSampleItems();
    }


    /**
     * Основной цикл меню.
     */
    public void start() {
        while (true) {
            System.out.println("Старт. Выберите нужную опцию: ");
            System.out.println("1. Добавить новый товар");
            System.out.println("2. Поиск по номеру каталога");
            System.out.println("3. Поиск по бренду");
            System.out.println("4. Поиск по наименованию товара");
            System.out.println("5. Поиск по категории товара");
            System.out.println("6. Поиск по бренду и наименованию товара");
            System.out.println("7. Поиск по ценовому диапазону");
            System.out.println("8. Показать все товары");
            System.out.println("0. Выход");
            System.out.print("Выберите опцию: ");

            String choice = UserInputStatic.inputText("Выберите опцию:");
            switch (choice) {
                case "1":
                    addItem();
                    break;
                case "2":
                    findByNumberId();
                    break;
                case "3":
                    findByBrand();
                    break;
                case "4":
                    findByTitle();
                    break;
                case "5":
                    findByCategory();
                    break;
                case "6":
                    findByBrandAndTitle();
                    break;
                case "7":
                    findByBrandAndTitle();
                    break;
                case "8":
                    showAll();
                    break;
                case "0":
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова.");
            }
        }
    }

    private void addItem() {
        String number = UserInputStatic.inputText("Введите номер в каталоге : ");
        String brand = UserInputStatic.inputText("Введите бренд товара: ");
        String category = UserInputStatic.inputText("Введите категорию товара: ");
        String title = UserInputStatic.inputText("Введите наименование товара: ");
        int price = UserInputStatic.inputInt("Введите цену");

        String addResultMessage = service.addItem(number, brand, category, title, price);
        System.out.println(addResultMessage);
    }

    private void findByNumberId() {
        String number = UserInputStatic.inputText("Введите искомый номер: ");
        Item item = service.findByCatologId(number);
        System.out.println(item != null ? item : "Товар с таким номером в каталоге не найден.");
    }


    private void findByBrand() {
        String brand = UserInputStatic.inputText("Введите бренд: ");
        Item[] itemsByBrands = service.findByBrand(brand);
        if (itemsByBrands.length == 0) {
            System.out.println("Товары этого бренда не найдены.");
        } else {
            System.out.println("Найдено товаров: " + itemsByBrands.length);
            for (Item item : itemsByBrands) {
                System.out.println("  " + item);
            }
        }
    }

    private void findByCategory() {
        String category = UserInputStatic.inputText("Введите категорию товара: ");
        Item[] itemsByCategory = service.findByBrand(category);
        if (itemsByCategory.length == 0) {
            System.out.println("Товары этого категории не найдены.");
        } else {
            System.out.println("Найдено товаров: " + itemsByCategory.length);
            for (Item item : itemsByCategory) {
                System.out.println("  " + item);
            }
        }
    }

    private void findByTitle() {
        String number = UserInputStatic.inputText("Введите наименование товара: ");
        Item item = service.findByCatologId(number);
        System.out.println(item != null ? item : "Товар с таким наименованием в каталоге не найден.");
    }

    private void findByBrandAndTitle() {
        String brand = UserInputStatic.inputText("Введите бренд: ");
        String title = UserInputStatic.inputText("Введите бренд: ");
        Item[] itemsByBrandsTitle = service.findByBrandAndTitle(brand, title);
        if (itemsByBrandsTitle.length == 0) {
            System.out.println("Товары этого бренда с таким наименованием не найдены.");
        } else {
            System.out.println("Найдено товаров: " + itemsByBrandsTitle.length);
            for (Item item : itemsByBrandsTitle) {
                System.out.println("  " + item);
            }
        }
    }

    private void findByPriceRange() {
        System.out.print("Минимальная цена: ");
        int min = UserInputStatic.inputInt("Введите минимальную цену для поиска:");
        int max = UserInputStatic.inputInt("Введите максимальную цену для поиска:");

        Item[] itemsByPrice = service.findByPriceRange(min, max);
        if (itemsByPrice.length == 0) {
            System.out.println("Товары в этом диапазоне не найдены.");
        } else {
            System.out.println("Найдено товаров: " + itemsByPrice.length);
            for (Item item : itemsByPrice) {
                System.out.println("  " + item);
            }
        }
    }

    private void showAll() {
        Item[] items = service.getAll();
        System.out.println("Всего в каталоге: " + items.length);


        /*Пройдись по всему массиву и для каждого элемента из массива
        возьми его и сохрани во временную переменную

        ВСЕ ДАЛЬНЕЙШИЕ ДЕЙСТВИЯ БУДУТ ОСУЩЕСТВЛЯТЬ ТОЛЬКО С ЭТОЙ ВРЕМЕННОЙ ПЕРЕМЕННОЙ

         */
        for (Item tempItem : items) {
            System.out.println("  " + tempItem);
        }
    }
}
