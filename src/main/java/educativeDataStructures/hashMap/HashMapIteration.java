package educativeDataStructures.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {
    public static void main(String[] args) {

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        Set<Entry<String, Integer>> entrySet = stockPrice.entrySet();// Returns a Set of Entries

        for (Entry<String, Integer> entry : entrySet) {
            System.out.println("Company name: " + entry.getKey() + " Stock Price: " + entry.getValue());
        }

        stockPrice.forEach((key, value) -> System.out.println("Company name: " + key + " Stock Price: " + value));
    }
}
