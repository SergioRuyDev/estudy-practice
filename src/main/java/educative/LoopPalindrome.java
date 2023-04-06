package educative;

public class LoopPalindrome {
    public static void main(String[] args) {

        int input[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 21, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int pflag = 1;
        int length = 24;
        length = length / 2;
        int check = 23;
        for (int a = 0; a < length; a++) {
            if(input[a] != input[check]) {
                pflag = 0;
            }
            check --;
        }
        if (pflag == 0) {
            System.out.println("This array is NOT a palindrome!");
        } else {
            System.out.println("This array is a PALINDROME!");
        }

        pflag =1;
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        length = 23;
        check = 22;
        for (int a = 0; a < length; a++) {
            if(values[a] != values[check]) {
                pflag = 0;
            }
            check --;
        } if (pflag == 0) {
            System.out.println("This array is NOT a palindrome!");
        } else {
            System.out.println("This array is a PALINDROME!");
        }
    }

//    In the program above:
//
//We use the variables input and values to store the array values.
//We use a variable pflag and assign it a value 1.
//We compare the array values starting from the first index with the last index in the first iteration of the loop.
//In every subsequent iteration of the loop, we compare the second index with the second to the last, the third index with the third to the last, and so on.
//We update the value of pflag with 0 if the values are not the same.
//The value of pflag remains 1 if all the index values are the same.
//We display "This array is a PALINDROME!" if the value of pflag is 1 after the body of the for loop. Otherwise, the "This array is NOT a palindrome!".
}
