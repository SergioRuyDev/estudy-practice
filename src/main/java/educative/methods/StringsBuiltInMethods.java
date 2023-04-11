package educative.methods;

//The methods related to case change
//These methods change the letter case of the text stored in a string (say, from lowercase to uppercase). Let’s use an
// example program to explore case changes.
//
//The toLowerCase() method converts all characters in a string to lowercase.
//The toUpperCase() method converts all characters in a string to uppercase.
//The search-related methods
//These methods search for the occurrence of text in a string. Let’s use an example program to explore searches.
//
//The equals() method compares two strings and returns true if both strings are equal.
//The endsWith() method checks whether the specified character is the last character of the string or not, and returns
// true or false.
//The contains() searches for a character or a substring in the string and returns true or false.
//The replace() searches for all occurrences of a text in the string, replaces it with different text, and returns the
// new string after replacement.
//The indexOf() returns the position of the specified character in the string.
//The startsWith() checks for text at the start of a string and returns true or false.
//The charAt() returns the character at the given index.
public class StringsBuiltInMethods {
    public static void main(String[] args) {

        System.out.println("educative".equals("educative"));
        System.out.println("educative".endsWith("ve"));
        System.out.println("educative".contains("cet"));
        System.out.println("educative".replace('e','E'));
        System.out.println("educative".indexOf("t"));
        System.out.println("educative".startsWith("edu"));
        System.out.println("educative".charAt(2));

        String str1 = "hello";
        String str2 = new String("hello");

        if (str1 == str2) {
            // this condition is false, even though str1 and str2 have the same contents
            System.out.println("The result of ==");
        }

        if (str1.equals(str2)) {
            // this condition is true,
            System.out.println("The result of .equals");

        }
    }
}
