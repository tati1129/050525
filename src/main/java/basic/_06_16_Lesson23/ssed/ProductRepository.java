package basic._06_16_Lesson23.ssed;

public class ProductRepository {
    private Product[] database;
    private int lastProductIndex = 0;

    public ProductRepository(Product[] database) {
        this.database = new Product[100];
    }

    public boolean save(Product product) {
        if (lastProductIndex <= database.length) {
            database[lastProductIndex++] = product;
            return true;
        } else {
            return false;
        }
    }

    public Product findId(int id) {
        for (Product product : database) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product[] fidBYBrand(String brand) {
        int counter = 0;
        for (int i = 0; i < lastProductIndex; i++) {
            Product currentPtoduct = database[i];
            if (currentPtoduct.getBrand().equalsIgnoreCase(brand)) {

                counter++;
            }
        }
        Product[] newProduct = new Product[counter];
        int index = 0;
        for (int i = 0; i < lastProductIndex; i++) {
            Product currentPtoduct = database[i];
            if (currentPtoduct.getBrand().equalsIgnoreCase(brand)) {
                newProduct[index++] = currentPtoduct;

            }
        }
        return newProduct;
    }


    public Product findByTitle(String title) {
        for (int i = 0; i < lastProductIndex; i++) {
            Product currentPtoduct = database[i];
            if (currentPtoduct.getTitle().equalsIgnoreCase(title)) {
                return currentPtoduct;
            }
        }
        return null;
    }


    public Product[] fidByCategory(String category) {
        int counter = 0;
        for (int i = 0; i < lastProductIndex; i++) {
            Product currentPtoduct = database[i];
            if (currentPtoduct.getCategory().equalsIgnoreCase(category)) {
                counter++;
            }
        }
        Product[] newProduct = new Product[counter];
        int index = 0;
        for (int i = 0; i < lastProductIndex; i++) {
            Product currentPtoduct = database[i];
            if (currentPtoduct.getCategory().equalsIgnoreCase(category)) {
                newProduct[index++] = currentPtoduct;

            }
        }
        return newProduct;
    }

    public Product[] findByCategoryBrand(String brand, String category){
        int counter = 0;
        for (int i = 0; i < lastProductIndex; i++) {
           boolean checkCurrentProducktResult  =checkCurrentProduckt(database[i], brand,category);
            if (checkCurrentProducktResult) {
                counter++;
            }
        }
        Product[] newProduct = new Product[counter];
        int index = 0;
        for (int i = 0; i < lastProductIndex; i++) {
            Product currentPtoduct = database[i];
            if (currentPtoduct.getCategory().equalsIgnoreCase(category)) {
                newProduct[index++] = currentPtoduct;

            }
        }
        return newProduct;
    }

    private boolean checkCurrentProduckt(Product product, String brand, String category) {
        if (product.getCategory().equalsIgnoreCase(category) && product.getBrand().equalsIgnoreCase(brand)){
            return  true;
        }else {
            return false;
        }
    }
}


