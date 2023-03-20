package educative;

public class EuclidsDistance {
    public static void main(String[] args) {

        // You are required to write the code to calculate Euclidean distance
        // to store in the variable dist

        // Assume that we have the following variables already defined:
        // xp, yp and xq, yq
        int xp = 5;
        int yp = 8;
        int xq = 9;
        int yq = 11;

        // Here we calculate dx and dy
        int dx = xq - xp;
        int dy = yq - yp;
        // You are required to use the above variables to calculate
        // the euclidean distance and store the result in the variable dist
        double dist = 0.0;
        dist = Math.sqrt((dx * dx) + (dy * dy)); // Calculating Euclidean Distance
        System.out.println("The Euclidean distance between (" + xp + "," + yp + ") and (" + xq + ", " + yq +")"+ " is " + dist);
    }

}
