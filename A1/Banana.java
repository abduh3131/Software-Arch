public class Banana {
    private final double price;

    public Banana(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Banana - Price: " + price;
    }
}
