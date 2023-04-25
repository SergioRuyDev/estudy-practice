package educativeDataStructures.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

    public static void main(String[] args) {

        Map<String, Integer> stockprice = new HashMap<>();

        stockprice.put("Oracle", 100);
        stockprice.put("Google", 120);
        stockprice.put("Microsoft", 200);
        stockprice.put("Apple", 300);

        //This will return null as Google is not present in the Map.
        System.out.println(stockprice.remove("Oracle"));

        //This will return null as Google is not present in the Map.
        System.out.println(stockprice.remove("Google", 120));

        //This will return false because the value passed does not match the value of BMW in the Map.
//        System.out.println("Apple", 320);

        //Check if contains some key
        System.out.println(stockprice.containsKey(100));

        // Fetch all the keys
        System.out.println(stockprice.keySet());

        // Fetch all the values
        System.out.println(stockprice.values());

    }
}
