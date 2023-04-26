package educativeDataStructures.hashMap;

//Problem 1: Find the highest stock price#
//Find the company with the highest stock price.
//
//Problem 2: Find the average stock price
//Find the average stock price of all the companies
//
//Problem 3: Remove companies with stock price below 50
//Remove all the companies that have a stock price of fewer than 50 dollars.

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapChallenger {

    public static void main(String[] args) {

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);

// Problem 1 Solution
//        To find the company with the highest stock price, we will have to first iterate the HashMap.
//        We can get the EntrySet and then iterate over it. For each entry, we will check if the stock price is more
//        than whatever max value we have. If yes, we will store the company corresponding to this entry in a variable.

        int max = 0;
        String company = "";

        for (Entry<String, Integer> entry : stockPrice.entrySet()) {
            if (entry.getValue() > max) {
                company = entry.getKey();
                max = entry.getValue();
            }
        }


        System.out.println("Company with max stock price is: " + company);

//        Problem 2 Solution
//        To find the average stock price of all the companies, we will first get the sum of all the stock prices.
//        After that, we will divide it by the number of companies. We can use the values() method to get the list of
//        all the values.
//        The sum of all the values can be found through Java 8 features as well, which is shown in the below example.

        Collection<Integer> values = stockPrice.values();
//        int sum = 0;
//        for (int i : values) {
//            sum += i;
//        }
        // Sum of values using Java 8 features
//        int sum = values.stream().mapToInt(i -> i.intValue()).sum();
        int sum = values.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The average stock price is " + sum / values.size());


        // Problem 3 Solution
//      To remove all the companies with prices lower than 50, we will iterate the EntrySet using an iterator and will
//      use the iterator to remove the elements.

        Set<Entry<String, Integer>> entrySet = stockPrice.entrySet();// Returns a Set of Entries

        Iterator<Entry<String, Integer>> itr = entrySet.iterator(); //Getting the iterator

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Company name: " + entry.getKey() + " Stock Price: " + entry.getValue());

            if (entry.getValue() < 50) {
                itr.remove();
            }
        }
        System.out.println(stockPrice);


    }
}
