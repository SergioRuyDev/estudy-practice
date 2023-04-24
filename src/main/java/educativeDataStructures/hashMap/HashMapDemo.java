package educativeDataStructures.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56); // Inserting share prices of Oracle in the Map
        System.out.println(stockPrice);

        stockPrice.put("Oracle", 60); // Inserting share price of Oracle again. This will update the value.
        System.out.println(stockPrice);

        stockPrice.putIfAbsent("Oracle", 70); //Inserting share price of Oracle again using putIfAbsent() method.
        // This will not update the value.
        System.out.println(stockPrice);

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        System.out.println(stockPrice.get("Oracle"));
        System.out.println(stockPrice.get("Google")); // This will return null

        //Since Google is not present in our Map, this will insert it with default value 100
        System.out.println(stockPrice.getOrDefault("Google", 100));

        // This will not replace the value of Oracle because current value is not 77.
        stockPrice.replace("Oracle", 77, 76);

        // This will replace the value of Oracle because current value is 56.
        stockPrice.replace("Oracle", 56, 76);

        // This will replace the value of Fiserv as current value does not matter.
        stockPrice.replace("Fiserv", 100);

        // Using the replaceAll() method to add 10 to the price of each stock.
        stockPrice.replaceAll((k,v) -> v + 10);
        System.out.println(stockPrice);

    }
}
