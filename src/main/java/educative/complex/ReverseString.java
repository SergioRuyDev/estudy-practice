package educative.complex;

//Reverse a string
//The following program stores the reverse of a string to another string.

public class ReverseString {
    public static void main(String[] args) {

        String p = "was it a car or a cat i saw"; // The string to be reversed
        System.out.println("ORIGINAL string is: " + p);
        int lp = p.length(); // Calculating length of string p
        String q = ""; // empty string to store the reverse
        int i = lp - 1;

        while (i >= 0) // This loop will terminate until i is less than lp / 2
        {
            q += p.charAt(i); // Appending the characters of p to q in a backward fashion
            i -= 1;
        }
        System.out.println("REVERSED string is: " + q);
    }
}
