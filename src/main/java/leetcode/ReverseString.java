package leetcode;

public class ReverseString {

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);
        String sNew = s.toString();
        System.out.println(sNew);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;

        while (left < right) {
            //create the temporary variable
            char tmp = s[left];

            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
