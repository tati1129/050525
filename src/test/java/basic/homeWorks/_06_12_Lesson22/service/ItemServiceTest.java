package basic.homeWorks._06_12_Lesson22.service;

import basic.homeWorks._06_12_Lesson22.entity.Item;
import basic.homeWorks._06_12_Lesson22.repositiry.CatalogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemServiceTest {
    private CatalogRepository catalogRepository;
    private ItemService itemService;


    @BeforeEach
    void setUp() {
        catalogRepository = new CatalogRepository(5); // например, вместимость 5
        itemService = new ItemService(catalogRepository);
    }
    @Test
    void addItem() {

        String result = itemService.addItem("D233", "EEEE","GGGGGG", "ffff", 2000);
        assertEquals("Done!", result);

        Item added = catalogRepository.findById("D233");
        assertNotNull(added);
        assertEquals("EEEE", added.getBrand());
        assertEquals("GGGGGG", added.getCategory());
        assertEquals("ffff", added.getTitle());
        assertEquals(2000, added.getPrice());
    }

    @Test
    void findByCatologId() {
    }

    @Test
    void findByTitle() {
    }

    @Test
    void findByBrand() {
    }

    @Test
    void findByCategory() {
    }

    @Test
    void findByBrandAndTitle() {
    }

    @Test
    void findByPriceRange() {
    }

    @Test
    void getAll() {
    }

    @Test
    void fillSampleItems() {
    }
}