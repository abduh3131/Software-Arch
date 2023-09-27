public class BananaFactory implements GroceryProductFactory {
    private double price;
    private final DataFile dataFile;
    private Banana banana;

    public BananaFactory(DataFile dataFile) {
        this.dataFile = dataFile;
    }

    @Override
    public void createProduct() {
        setPriceFromFile();
        banana = new Banana(price);
    }

    @Override
    public void displayProduct() {
        System.out.println(banana);
    }

    @Override
    public void setPriceFromFile() {
        this.price = dataFile.getPrice("Banana");
    }
}
