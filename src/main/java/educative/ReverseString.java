package educative;

//Write a program that stores the string into another string in reverse order.

public class ReverseString {
    public static void main(String[] args) {

        String text = "Educative";

        for (int i = 8; i >= 0; i--) {
            System.out.println(text.charAt(i));
        }
    }
}
