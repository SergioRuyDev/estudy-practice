package educative;

//The Cartesian product of the sets A = {-1, -2, -3} and B = {1, 2, 3} is
//A x B = {(-1, 1) (-1, 2) (-1, 3) (-2, 1) (-2, 2) (-2, 3) (-3, 1) (-3, 2) (-3, 3)}.
//This can be achieved in programming with the help of two nested for loops.
// The outer loop iterates through the elements of the first set, and the inner loop iterates through
// the elements of the second set against each element of the first set.

public class CartesianProduct {
    public static void main(String[] args) {

        for (int e = -1; e >= -3; e--) // outer loop
        {
            for (int m = 1; m <= 3; m++) //inner loop
            {
                System.out.print("(" + e + ", " + m + ") ");
            }
        }
    }
}
