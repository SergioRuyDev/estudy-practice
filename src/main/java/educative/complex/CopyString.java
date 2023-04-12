package educative.complex;

public class CopyString {
    public static void main(String[] args) {

        String src = "Just a string"; // The string to be copied
        int lsrc = src.length();// Calculating the length of src
        String dst = ""; // Creating an empty string

        dst = src; // Copying data from src to dst

        System.out.println("src: " + src);
        System.out.println("dst: " + dst);

        String str1 = "Just a"; // The string 1
        String str2 = " string"; // The string 2
        String str3 = ""; // Creating empty string to store the concatenation result

        str3 = str1 + str2; // Concatenating str1 with str2 and store it in str3

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
