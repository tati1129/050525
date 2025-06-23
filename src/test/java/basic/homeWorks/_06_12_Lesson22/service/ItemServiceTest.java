package basic.homeWorks._06_12_Lesson22.service;

import basic.homeWorks._06_12_Lesson22.entity.Item;
import basic.homeWorks._06_12_Lesson22.repositiry.CatalogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemServiceTest {

    private CatalogRepository repository;
    private ItemService service;

    @BeforeEach
    void setUp() {
        repository = new CatalogRepository(10);
        service = new ItemService(repository);


        // Добавляем несколько товаров для тестирования
        service.addItem("f1", "Tefal", "kitchen", "pan", 5000);
        service.addItem("f2", "Tefal", "kitchen", "spoon", 400);
        service.addItem("K1", "Kenwood", "electronic", "Mixer", 9000);
        service.addItem("K2", "Apple", "electronic", "laptop", 19000);
        service.addItem("K3", "Tefal", "kitchen", "pan", 3000);
    }

    @Test
    void testAddItem_Success() {
        // Создаем тестовые данные
        String catalogId = "B3";
        String brand = "Berghoff";
        String category = "kitchen";
        String title = "jucer";
        int price = 9000;

        // Добавляем элемент через сервис
        String result = service.addItem(catalogId, brand, category, title, price);

        // Проверяем, что добавление прошло успешно
        assertEquals("Done!", result);

        // Проверяем, что элемент был добавлен в репозиторий
        Item addedItem = repository.findById(catalogId);
        assertNotNull(addedItem);
        assertEquals(catalogId, addedItem.getCatalogId());
        assertEquals(brand, addedItem.getBrand());
        assertEquals(category, addedItem.getCategory());
        assertEquals(title, addedItem.getTitle());
        assertEquals(price, addedItem.getPrice());


    }

    @Test
    void testAddItem_Failure_ExistingCatalogId() {

        // Добавляем первый товар
        service.addItem("K33", "Kenwood", "electronic", "Mixer", 9000);

        // Пытаемся добавить второй товар с тем же catalogId
        String result = service.addItem("K33", "Kenwood", "electronic", "Jucer", 8000);

        // Проверяем, что метод вернул ошибку
        assertEquals("error!", result);

    }


    @Test
    void testFindByCatalogId() {
        // Ищем товар по catalogId "K1"
        Item item = service.findByCatologId("K2");

        // Проверяем, что товар найден и его данные совпадают
        assertNotNull(item);
        assertEquals("K2", item.getCatalogId());
        assertEquals("Apple", item.getBrand());
        assertEquals("electronic", item.getCategory());
        assertEquals("laptop", item.getTitle());
        assertEquals(19000, item.getPrice());
    }

    @Test
    void testFindByCatalogId_notFound() {
        // Ищем товар по несуществующему catalogId "NonExistentId"
        Item item = service.findByCatologId("NonExistentId");

        // Проверяем, что метод вернул null
        assertNull(item);
    }


    @Test
    void testFindByTitle() {
        // Ищем товар по catalogId "K1"
        Item item = service.findByTitle("Mixer");

        // Проверяем, что товар найден и его данные совпадают
        assertNotNull(item);
        assertEquals("K1", item.getCatalogId());
        assertEquals("Kenwood", item.getBrand());
        assertEquals("electronic", item.getCategory());
        assertEquals("Mixer", item.getTitle());
        assertEquals(9000, item.getPrice());
    }

    @Test
    void testFindByTitle_notFound() {
        // Ищем товар по несуществующему title "NonExistent"
        Item item = service.findByTitle("NonExistent");

        // Проверяем, что метод вернул null
        assertNull(item);
    }

    @Test
    void testFindByBrand() {
        //Ищем товар по производителю
        Item[] items = service.findByBrand("Tefal");

        assertNotNull(items);
        assertEquals(3, items.length);

        for (Item item : items) {
            assertEquals("Tefal", item.getBrand());
        }

        assertEquals("f1", items[0].getCatalogId());
        assertEquals("f2", items[1].getCatalogId());
        assertEquals("K3", items[2].getCatalogId());


        for (Item item : items) {
            assertEquals("kitchen", item.getCategory());
        }

        assertEquals("pan", items[0].getTitle());
        assertEquals("spoon", items[1].getTitle());
        assertEquals("pan", items[2].getTitle());
    }


    @Test
    void testFindByCategory() {
        Item[] items = service.findByCategory("electronic");
        assertNotNull(items);
        assertEquals(2, items.length);

        for (Item item : items) {
            assertEquals("electronic", item.getCategory());
        }
    }

    @Test
    void testFindByBrandAndTitle() {
        Item[] items = service.findByBrandAndTitle("Tefal", "pan");


        assertNotNull(items);
        assertEquals(2, items.length);

        for (Item item : items) {
            assertEquals("Tefal" , item.getBrand());
            assertEquals("pan", item.getTitle());
        }
    }

   @Test
    void  testFindByPriceRange(){

        Item[] items = service.findByPriceRange(300,8000);

        assertNotNull(items);

        assertEquals(3,items.length);

        for (Item item : items){
            assertTrue(item.getPrice()>300 && item.getPrice()<8000);
        }

       Item[] items2 = service.findByPriceRange(100000,200000);
       assertEquals(0,items2.length);
   }

   @Test
    void testGetAll(){
        Item[] items = service.getAll();

       assertNotNull(items);
       assertEquals(5,items.length);
   }

}