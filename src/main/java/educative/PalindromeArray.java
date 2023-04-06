package educative;

//Write a program that checks if an array is a palindrome.
// The length of the array is restricted to five elements.

public class PalindromeArray {
    public static void main(String[] args) {

//        String[] palindrome = {"ab", "cd", "ef", "cd", "ab"};
        String[] palindrome = {"a", "c", "e", "d", "a"};

        if (palindrome[0] == palindrome[4] && palindrome[1] == palindrome[3]) {
            System.out.println("The array is palindrome");
        } else {

            System.out.println("The Array is NOT palindrome");
        }
    }
}
