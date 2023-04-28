//Rules for Tic-tac-toe
//Tic-tac-toe is played on a 3x3 grid.
//
//There are only two players.
//
//One player plays with “X”, and the other player plays with “O”. They play in alternative turns and place an “X” or an
// “O” in empty positions.
//
//The first player to get three of their characters in a row (horizontal), column (vertical), or diagonal is the winner.
//
//The game ends when one player wins, or nobody wins. The latter case means that the game ends in a tie.
//
//Tic-tac-toe in Java
//A complete Tic-tac-toe game can be easily created in Java. The core part of the code includes conditional statements,
// iteration (loops), and 2D arrays. This project will also focus on method implementation in Java. We’ll make this game together in this project. First, we’ll create and display the game board and then we’ll implement the logic of the game.
//
//Overview of the project
//In this project, we’ll cover the following:
//
//Create the Tic-tac-toe game board
//Display the game board
//Take user input (their moves)
//Implement the winning logic
//Implement the tie logic

package educativeDataStructures.projects;

public class TicTacToe {
    public static void main(String[] args) {

        //Let's create a m x n character array that represents our tic tac toe board
        /* Write your code for task 1 here */
        char[][] mXn = {{'X', 'X', 'X'}, {'O', 'O', 'O'}, {'O', 'O', 'O'}};
        displayBoard(mXn);

        //Calling the method/function to print out the game board
        //displayBoard(game_board);

    }

    public static void displayBoard(char[][] gameBoard) {
        System.out.println("Tic Tac Toe Board");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                for (int y = 0; y < 2; y++) {
                    System.out.print(gameBoard[i][j] + "|");
                }
                System.out.println(" ");
            }
//            System.out.println(" ");
        }
    }
}
