package leetcode.hashmaps;

import java.util.HashSet;
import java.util.Set;

/**
 *  First Letter to Appear Twice
 *
 * Given a string s, return the first character to appear twice. It is guaranteed that the input will have a
 * duplicate character.
 */
public class FirstLetterAppearTwice {
    public static void main(String[] args) {

        String s = "operation";

        char result = findAppearTwiceForceBrute(s);
        if (result == ' ') {
            System.out.println("Not letter appear twice in the String");
        } else {
            System.out.println("The first letter appear twice is: " + result);
        }

        char resultSet = repeatedCharacter(s);
        if (resultSet == ' ') {
            System.out.println("Not letter appear twice in the String");
        } else {
            System.out.println("The first letter appear twice is: " + resultSet);
        }
    }

    /**
     * The brute force solution would be to iterate along the string, and for each character c, iterate again up to c
     * to see if there is any match.
     */
    private static char findAppearTwiceForceBrute(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    return c;
                }
            }
        }
        return ' ';
    }

    /** This is O(n2) due to the nested loop. The second loop is checking for the existence of c, which can be done in
    * O(1) using a set.
    */
    private static char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }
        return ' ';
    }
}
