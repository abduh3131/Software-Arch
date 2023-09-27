public class Apple {
    private final double price;

    public Apple(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple - Price: " + price;
    }
}
