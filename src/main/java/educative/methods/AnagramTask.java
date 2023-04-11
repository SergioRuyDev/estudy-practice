package educative.methods;

//Write a function that accepts two strings as parameters and checks whether these strings are anagrams of each other. An anagram is a text formed by rearranging the letters of another piece of text.
//
//The strings should not be case-sensitive, meaning that Cats and AcTs are anagrams.

//The function should return 1 when the strings are anagrams and -1 otherwise.

import java.util.Arrays;

public class AnagramTask {
    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "Listen";

        checkAnagram(str1, str2);

    }

    private static int checkAnagram(String str1, String str2) {
        int num = 0;
        str1 = str1.toLowerCase(); // Converting all characters of string 1 to lowercase
        str2 = str2.toLowerCase(); // Converting all characters of string 2 to lowercase
        char[] str1_ch = str1.toCharArray(); // Converting string to char array to sort
        char[] str2_ch = str2.toCharArray(); // Converting string to char array to sort
        Arrays.sort(str1_ch); // Sorting char array str1_ch
        Arrays.sort(str2_ch); // Sorting char array str2_2
        String sortedStr1 = new String(str1_ch); // Converting char array str1_ch to string
        String sortedStr2 = new String(str2_ch); // Converting char array str2_ch to string

        if (sortedStr1.equals(sortedStr2)) // Comparing if sortedStr1 is equals to sortedStr2
        {
            num = 1; // If both strings are equal, assign value 1 to variable num
            System.out.println("The strings are anagrams.");
            return num;
        } else {
            num = -1; // otherwise, assign value -1 to variable num
            System.out.println("The strings are not anagrams.");
            return num;
        }
    }
}
