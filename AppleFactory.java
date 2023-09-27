public class AppleFactory implements GroceryProductFactory {
    private double price;
    private final DataFile dataFile;
    private Apple apple;

    public AppleFactory(DataFile dataFile) {
        this.dataFile = dataFile;
    }

    @Override
    public void createProduct() {
        setPriceFromFile();
        apple = new Apple(price);
    }

    @Override
    public void displayProduct() {
        System.out.println(apple);
    }

    @Override
    public void setPriceFromFile() {
        this.price = dataFile.getPrice("Apple");
    }
}
