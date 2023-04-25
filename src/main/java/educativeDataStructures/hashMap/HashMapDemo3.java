package educativeDataStructures.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Brazil", 5);
        map.put("India", 3);
        map.put("USA", 6);
        map.put("Canada", 10);
        map.put("China", 7);

        // This will increment the value of Brazil by 15 as it is present in the Map
        map.compute("Brazil", (k,v) -> v == null ? 10 : v + 15);

        // This will insert Vietnam in the Map with default value of 10.
        map.compute("Vietnam", (k,v) -> v == null ? 10 : v + 15);

        System.out.println(map);

        // Russia is absent, we store and attribute the length of string as a value
//        map.computeIfAbsent("Russia", k -> k.length());
        map.computeIfAbsent("Russia", String::length);

        System.out.println(map);

        //// This will increment the value of Vietnam by 1 as it is present in the Map
        map.computeIfPresent("Vietnam", (k,v) -> v == null ? 10 : v + 1);
//        map.computeIfPresent("Vietnam", (k, v) -> v + 1);

        // This will not insert Mexico in the Map.
        map.computeIfPresent("Mexico", (k, v) -> v == null ? 10 : v + 1);
    }
}
