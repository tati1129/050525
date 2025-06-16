package basic.homeWorks._06_12_Lesson22.repositiry;

import basic.homeWorks._06_12_Lesson22.entity.Item;

public class CatalogRepository {
    private Item[] catalog;
    int size;

    public CatalogRepository(int catalogCapasity) {
        this.catalog = new Item[catalogCapasity];
        this.size = 0;
    }

    public boolean addItem(Item item) {
        if (size >= catalog.length) {
            return false;
        }
        catalog[size++] = item;
        return true;
    }

    public Item findById(String catalogId) {
        for (int i = 0; i < size; i++) {
            Item currentItem = catalog[i];
            if (currentItem.getCatalogId().equalsIgnoreCase(catalogId)) {
                return currentItem;
            }
        }
        return null;
    }

    public Item findByTitle(String title) {
        for (int i = 0; i < size; i++) {
            Item currentItem = catalog[i];
            if (currentItem.getTitle().equalsIgnoreCase(title)) {
                return currentItem;
            }
        }
        return null;
    }

    public Item[] findByCategory(String category) {
        int countByCategory = 0;
        for (int i = 0; i < size; i++) {
            Item currentItem = catalog[i];
            if (currentItem.getCategory().equalsIgnoreCase(category)) {
                countByCategory++;
            }
        }
        Item[] itemByCategory = new Item[countByCategory];
        int index = 0;
        for (int i = 0; i < size; i++) {
            Item currentItem = catalog[i];
            if (currentItem.getCategory().equalsIgnoreCase(category)) {
                itemByCategory[index++] = currentItem;
            }
        }
        return itemByCategory;

    }

    public Item[] findByBrand(String brand) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            Item curentItem = catalog[i];
            if (curentItem.getBrand().equalsIgnoreCase(brand)) {
                counter++;
            }
        }

        Item[] itemByBrand = new Item[counter];
        int index = 0;
        for (int i = 0; i < size; i++) {
            Item currentItem = catalog[i];
            if (currentItem.getBrand().equalsIgnoreCase(brand)) {
                itemByBrand[index++] = currentItem;
            }
        }
        return itemByBrand;
    }


    public Item[] findByBrandAndTitle(String brand, String title) {
        int counter = 0;

        for (int i = 0; i < size; i++) {
            Item currentItem = catalog[i];
            if (currentItem.getBrand().equalsIgnoreCase(brand) && currentItem.getTitle().equalsIgnoreCase(title)) {
                counter++;
            }
        }
        int index = 0;
        Item[] itemsByBrandTitle = new Item[counter];
        for (int i = 0; i < size; i++) {
            Item currentItem = catalog[i];
            if (currentItem.getBrand().equalsIgnoreCase(brand) && currentItem.getTitle().equalsIgnoreCase(title)) {
                itemsByBrandTitle[index++] = currentItem;
            }
        }
        return itemsByBrandTitle;
    }


    public Item[] findByPriceRange(int min, int max) {
        if (min > max) {
            int temp = 0;
            temp = max;
            max = min;
            min = temp;
        }

        int counter = 0;
        for (int i = 0; i < size; i++) {
            Item cerrentItem = catalog[i];
            if (cerrentItem.getPrice() >= min && cerrentItem.getPrice() <= max) {
                counter++;
            }
        }
        Item[] itemByRangePrice = new Item[counter];
        int index = 0;

        for (int i = 0; i < size; i++) {
            Item currentItem = catalog[i];
            if (currentItem.getPrice() >= min && currentItem.getPrice() <= max) {
                itemByRangePrice[index++] = currentItem;
            }
        }
        return itemByRangePrice;
    }

    ;


    public Item[] findAll() {
        Item[] existItem = new Item[size];
        for (int i = 0; i < size; i++) {
            existItem[i] = catalog[i];
        }
        return existItem;
    }

    ;
}

