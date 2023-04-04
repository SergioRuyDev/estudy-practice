package educative;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a word with 5 characters: ");
        String word = scanner.nextLine();

        if (word.charAt(0) == word.charAt(4) && word.charAt(1) == word.charAt(3)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
