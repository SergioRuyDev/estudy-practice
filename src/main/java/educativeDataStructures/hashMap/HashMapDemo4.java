package educativeDataStructures.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Sergio", 3000);
        map1.put("Leo", 2000);
        map1.put("Flavio", 5000);
        map1.put("Claudio", 4000);
        map1.put("Pericles", 10000);


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Flavio", 6000);
        map2.put("Claudio", 4500);
        map2.put("Pericles", 9000);
        map2.put("Julia", 7000);
        map2.put("Andressa", 3000);

        //merge these Maps to find the total amount that each person
//        map1.forEach((key, value) -> map2.merge(key, value, (v1, v2) -> v1 + v2));
        map1.forEach((key, value) -> map2.merge(key, value, Integer::sum));

        System.out.println(map2);
    }
}
