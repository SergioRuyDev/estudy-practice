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

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

//Let's create a 3x3 character array that represents our tic tac toe board
        char[][] gameBoard = new char[3][3];

        //variables to keep track of players
        char c = '-';
        boolean p1Turn = true;

        //Initialize our board with '-'
        for(int i = 0; i < 3; i++) {
            Arrays.fill(gameBoard[i], '-');
        }
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                gameBoard[i][j] = '-';
//            }
//        }

        while(true) {
            displayBoard(gameBoard);
            c = checkTurn(c, p1Turn);
            move(c,gameBoard);

            char temp = winner(gameBoard);
            if(temp == 'x') {
                displayBoard(gameBoard);
                System.out.println("Player1 (x) has won!");
                return;
            }
            else if(temp == 'o') {
                displayBoard(gameBoard);
                System.out.println("Player2 (o) has won!");
                return;
            }
            else {
                //If it's a tie or not
                if(tie(gameBoard)) {
                    System.out.println("It's a tie!");
                    return;
                }
                else {
                    //If player1 is true, make it false, and vice versa; this way, the players alternate each turn
                    p1Turn = !p1Turn;
                }
            }
        }

    }

    //Method to display the Tic-Tac-Toe board
    public static void displayBoard(char[][] gameBoard) {
        System.out.println("\nTic Tac Toe Board");

        //Outer loop will follow the row-major order
        for(int i = 0; i < 3; i++) {
            //Inner loop will follow the column-major order
            for(int j = 0; j < 3; j++) {
                System.out.print(gameBoard[i][j]+" ");
            }
            //This will make a new line after every row so that each row is printed on a separate line
            System.out.println();
        }
    }


    // Method to check whose turn it is                    */
    public static char checkTurn(char c, boolean p1Turn){

        if(p1Turn) {
            System.out.println("Player1's Turn (x):");
            c = 'x';
        } else {
            System.out.println("Player2's Turn (o):");
            c = 'o';
        }
        return c;
    }

    public static void move(char c, char[][] gameBoard) {

        //Indexes that correspond to a position on our board
        int row = 0;
        int col = 0;

        while(true) {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter a row number (0, 1, or 2): ");
            row = in.nextInt();
            System.out.print("Enter a column number (0, 1, or 2): ");
            col = in.nextInt();

            //Check if the row and col are 0, 1, or 2
            if(row < 0 || col < 0 || row > 2 || col > 2) {
                System.out.println("This position is off the bounds of the board! Try again.");
            }
            //Check if the position on the board the user entered is empty (has a -) or not
            else if(gameBoard[row][col] != '-') {
                System.out.println("Someone has already made a move at this position! Try again.");
            }
            //Otherwise, the position is valid so break out of the while loop
            else {
                System.out.println("\nInput is valid!");
                gameBoard[row][col] = c;
                System.out.println("\nGame board updated.");
                return;
            }
        }
    }

    //Method to implement winning conditions
    public static char winner(char[][] gameBoard) {

        //Check all the rows
        for(int i = 0; i < 3; i++) {
            if(gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2] && gameBoard[i][0] != ' ') {
                return gameBoard[i][0];
            }
        }

        //Check each column
        for(int j = 0; j < 3; j++) {
            if(gameBoard[0][j] == gameBoard[1][j] && gameBoard[1][j] == gameBoard[2][j] && gameBoard[0][j] != ' ') {
                return gameBoard[0][j];
            }
        }

        //Check the diagonals
        if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] != ' ') {
            return gameBoard[0][0];
        }
        if(gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] ==  gameBoard[0][2] && gameBoard[2][0] != ' ') {
            return gameBoard[2][0];
        }

        //Nobody has not won yet
        return ' ';

    }
    //Method to check for a tie
    public static boolean tie(char[][] gameBoard) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(gameBoard[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
