//Rules of the game
//The player has to guess a number between a specific range.
//
//When the player guesses a wrong number, the other person gives hints whether the guessed number is smaller or greater
// than the correct number.
//
//To make it a bit challenging, the player will get limited attempts to guess the number.

package educativeDataStructures.projects;

import java.util.Scanner;

public class GuessTheRightNumberGame {
    public static void main(String[] args) {

        System.out.println("You are playing the game: Guess the Number. \nYou have limited five to guess the correct number. \n");

        int secretNumber = (int) (Math.random() * (100 - 0 + 1));
        int userGuessNumber = 0;

        //FOR UNLIMITED ATTEMPTS
//        while (true) {
//            userGuessNumber = takeInput();
//            if (userGuessNumber < secretNumber) {
//                System.out.println("Your guessed number is smaller.");
//            } else if (userGuessNumber > secretNumber) {
//                System.out.println("Your guessed number is greater.");
//            } else {
//                System.out.println("Congratulations you win!");
//                return;
//            }
//
//        }
        //FOR LIMITED 5 ATTEMPTS
        for(int attempt = 0; attempt < 5; attempt++) {

            userGuessNumber = takeInput();

            if (userGuessNumber < secretNumber) {
                System.out.println("Your guessed number is smaller.");
            } else if (userGuessNumber > secretNumber) {
                System.out.println("Your guessed number is greater.");
            } else {
                System.out.println("Yay, you won!");
                return;
            }

        }
    }

    public static int takeInput()
    {
        //.......................Taking input....................
        Scanner userInput = new Scanner(System.in);
        //check for valid input and take input
        System.out.print("Enter a number between 0 to 100\n");
        int guess = 0;
        if(userInput.hasNextInt()) {
            guess = userInput.nextInt();
        }else {
            System.out.println("Enter a valid integer number between 0 and 100");
        }
        return guess;
        //.........................................................
    }
}
