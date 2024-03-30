package leetcode.hashmaps;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */
public class Pangram {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String other = "leetcode";

        boolean check = checkAlphabetAppears(sentence);
        System.out.println(check);

        boolean check2 = checkAlphabetAppears(other);
        System.out.println(check2);

        boolean check3 = checkIfPangram(other);
        System.out.println(check3);
    }

    //Better solution in O(1)
    public static boolean checkAlphabetAppears(String s) {

        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            seen.add(a);
        }
        return seen.size() == 26;
    }

    public static boolean checkIfPangram(String sentence) {
        return sentence.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == 26;
    }
}