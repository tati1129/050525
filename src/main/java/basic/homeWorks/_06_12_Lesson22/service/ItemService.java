package basic.homeWorks._06_12_Lesson22.service;

import basic.homeWorks._06_12_Lesson22.entity.Item;
import basic.homeWorks._06_12_Lesson22.repositiry.CatalogRepository;

public class ItemService {
private CatalogRepository catalogRepository;

    public ItemService(CatalogRepository catalog) {
        this.catalogRepository = catalog;
    }

    public String addItem(String catalogId,String brand, String category,String title, int price){
        Item item = new Item(catalogId,brand,category,title,price);

        boolean addResult = catalogRepository.addItem(item);

        if (addResult){
            return "Done!";
        }else {
            return  "error!";
        }

    }


    public Item findByCatologId(String catalogId){
       return catalogRepository.findById(catalogId);
    }


    public Item findByTitle(String title) {
        return catalogRepository.findByTitle(title);
    }
    public Item[] findByBrand(String brand) {
        return catalogRepository.findByBrand(brand);
    }

    public Item[] findByCategory(String category){
        return catalogRepository.findByCategory(category);
    }


    public Item[] findByBrandAndTitle(String brand, String title){
        return catalogRepository.findByBrandAndTitle(brand,title);
    }


    public Item[] findByPriceRange(int min, int max){
        return catalogRepository.findByPriceRange(min,max);
    }


    public Item[] getAll(){
        return catalogRepository.findAll();
    }



    public void fillSampleItems(){
        addItem("K1","Kenwood","electronic","Mixer", 9000);
        addItem("S1","Samsung","electronic","TV", 65000);
        addItem("A1","Apple","electronic","McBook", 64700);
        addItem("B22","BergHoff","kitchen","knife", 40000);
        addItem("O1","OXO","kitchen","fork", 40000);
        addItem("O2","OXO","kitchen","spoon", 500);
        addItem("O3","OXO","kitchen","fork", 600);
        addItem("D1","Dell","electronic","mouse", 900);
        addItem("D2","Dell","electronic","keyboard", 6500);
        addItem("D3","Dell","electronic","laptop", 40000);
        addItem("T1","Tefal","kitchen", "spatula", 3000);
    }
}
