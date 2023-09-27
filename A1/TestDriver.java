public class TestDriver {
    public static void main(String[] args) {
        DataFile dataFile = new DataFile();

        GroceryProductFactory bananaFactory = new BananaFactory(dataFile);
        bananaFactory.createProduct();
        bananaFactory.displayProduct();

        GroceryProductFactory appleFactory = new AppleFactory(dataFile);
        appleFactory.createProduct();
        appleFactory.displayProduct();
    }
}
