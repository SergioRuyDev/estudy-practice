package algaworks;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            String direction = "";

            if (initialTy < lightY)
            {
                initialTy++;
                direction = "S";
            }

            else if (initialTy > lightY)
            {
                initialTy--;
                direction = "N";
            }

            if (initialTx < lightX)
            {
                initialTx++;
                direction += "E";
            }

            else if (initialTx > lightX)
            {
                initialTx--;
                direction += "W";
            }

            System.out.println(direction);
        }
    }
}
