package educative.complex;

//Search characters in an array of strings#
//The following program checks whether a string or character is present in a string element.

public class SearchCharInStringArray {
    public static void main(String[] args) {

        String[] p = {"25", "55", "888", "9", "30", "45"}; // The 1st list which we want to search
        int lp = p.length; // Calculate the length of list p
        String r = "5";
        int i = 0;
        int found = 0;

        while (i < lp) // This loop will terminate until i is less than lp
        {
            if (p[i].contains(r)) // If the element of p contains r
            {
                System.out.println(r + " is found at index " + i);
                found = 1; // Update the variable found with 1
            }
            i += 1;
        }
        if (found == 0)
            System.out.println(r + " is NOT FOUND in the array");
    }
}
