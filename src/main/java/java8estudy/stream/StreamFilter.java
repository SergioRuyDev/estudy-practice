package java8estudy.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {

        List<Player> list = new ArrayList<>();
        list.add(new Player("Zidane", 17));
        list.add(new Player("Ronaldo", 25));
        list.add(new Player("Messi", 38));
        list.add(new Player("Rodrigo", 21));
        list.add(new Player("Dudu", 28));
        list.add(new Player("Coutinho", 36));
        list.add(new Player("Romario", 25));

        list.stream()
                .filter(players -> players.getAge() < 30 && players.getAge() > 21)
                .forEach(System.out::println);

        //In the above example, we wrote all the conditions in a single filter.
        //But We can also chain the filter method to make the code more readable.
        list.stream()
                .filter(player -> player.getName() != null ) // Filtering the object where name is not null
                .filter(player -> player.getAge() > 18 ) // Filtering the objects where age is greater than 18
                .filter(player -> player.getAge() < 30) // Filtering the objects where age is less than 30
                .forEach(System.out::println);
    }
}
