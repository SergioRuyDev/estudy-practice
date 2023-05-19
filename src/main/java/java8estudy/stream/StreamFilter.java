package java8estudy.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {

        List<Player> list = new ArrayList<>();
        list.add(new Player("Zidane", 41));
        list.add(new Player("Ronaldo", 25));
        list.add(new Player("Messi", 38));
        list.add(new Player("Rodrigo", 21));
        list.add(new Player("Dudu", 28));
        list.add(new Player("Coutinho", 36));
        list.add(new Player("Romario", 25));

        list.stream()
                .filter(players -> players.getAge() < 30 && players.getAge() > 21)
                .forEach(System.out::println);
    }
}
