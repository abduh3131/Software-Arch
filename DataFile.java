import java.util.*;

public class DataFile {
    private final Map<String, Double> priceMap = new HashMap<>();

    public DataFile() {
        priceMap.put("Banana", 2.0);
        priceMap.put("Apple", 1.0);
    }

    public double getPrice(String productName) {
        return priceMap.getOrDefault(productName, 0.0);
    }
}
