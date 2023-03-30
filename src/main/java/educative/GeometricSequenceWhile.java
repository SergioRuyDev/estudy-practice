package educative;

//Geometric sequence
//Write a program that shows the terms of the geometric sequence 1,3,9...
// that stops before the value exceeds 1000.

public class GeometricSequenceWhile {
    public static void main(String[] args) {
        int a = 1;
        while (a < 1000) {
            System.out.println(a);
            a = a * 3;
        }
    }
}
