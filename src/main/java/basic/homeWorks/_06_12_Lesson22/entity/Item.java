package basic.homeWorks._06_12_Lesson22.entity;

public class Item {
    private String catalogId;
    private String brand;
    private String category;
    private String title;
    private int price;

    public Item(String catalogId, String brand, String category, String title, int price) {
        this.catalogId = catalogId;
        this.brand = brand;
        this.category = category;
        this.title = title;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public String getTitle() {
        return title;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("Item { Номер каталога: '%s',наименование: '%s', брэнд: '%s', категория: '%s' цeна: '%d' }",catalogId, title, brand,category, price);
    }

}
