package educative;

public class Loops {
    public static void main(String[] args) {

        //Let’s take another example of generating the first 100 non-negative even numbers:
        for (int counter = 0; counter < 100; counter++) {
            int twice = counter * 2; //Multiply each value of a with 2
            System.out.println(twice);
        }

        // Other way to do it
        for(int c = 0; c < 100; c += 2) { // Using range function with step parameter
            System.out.println(c);
        }

//        Write a program that prints the first 100 positive odd numbers
        for (int c = 1; c < 200; c += 2) {
            System.out.println(c);
        }

//        Write a program that prints the terms of the arithmetic sequence 1, 6, 11, ... < 100.
        for (int i = 1; i < 100; i += 5) {
            System.out.println(i);
        }
    }
}
