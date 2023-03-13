//The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
//
//        Given two strings of lowercase English letters, A and B, perform the following operations:
//
//        1 - Sum the lengths of A and B.
//        2 - Determine if A is lexicographically larger than B. (i.e.: does B come before A in the dictionary?).
//        3 - Capitalize the first letter in A and B and print them on a single line, separated by a space.
//        Input Format
//
//        The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.
//
//        Output Format
//
//        There are three lines of output:
//        For the first line, sum the lengths of A and B.
//        For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
//        For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

package hackerrank;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int aChar = A.length();
        int bChar = B.length();
        int sumAeB = aChar + bChar;

        System.out.println(sumAeB);

        int compare = A.compareToIgnoreCase(B);


        if (compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(A.substring(0, 1).toUpperCase().concat(A.substring(1).toLowerCase()) + " " +
                B.substring(0, 1).toUpperCase().concat(B.substring(1).toLowerCase()));

    }
}
